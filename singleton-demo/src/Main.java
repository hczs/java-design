

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
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(threadNumber);
        ExecutorService executorService = Executors.newFixedThreadPool(threadNumber);
        for (int i = 0; i < threadNumber; i++) {
            executorService.submit(() -> {
                try {
                    // 先阻塞这别让这个线程跑起来
                    start.await();
                    // 创建实例
                    Singleton072.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 一个线程跑完 end计数器-1
                    end.countDown();
                }
            });
        }

        // start-1 所有线程启动，模拟并发
        start.countDown();
        // 阻塞直到执行完毕
        end.await();
        executorService.shutdown();

    }
}
