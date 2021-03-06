

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：hc
 * @date ：Created in 2022/2/27 21:41
 * @modified ：
 * 多线程环境下测试
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        int threadNumber = 100;
        HashSet<Singleton01> singleton01s = new HashSet<>();
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(threadNumber);
        ExecutorService executorService = Executors.newFixedThreadPool(threadNumber);
        for (int i = 0; i < threadNumber; i++) {
            executorService.submit(() -> {
                try {
                    // 先阻塞这别让这个线程跑起来
                    start.await();
                    // 创建实例
                    Singleton01 instance = Singleton01.getInstance();
                    singleton01s.add(instance);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 一个线程跑完 end计数器-1
                    end.countDown();
                }
            });
        }

        long startTime = System.currentTimeMillis();
        // start-1 所有线程启动，模拟并发
        start.countDown();
        // 阻塞直到执行完毕
        end.await();
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime ) + "ms");
        System.out.println(singleton01s.size());
        executorService.shutdown();

    }
}
