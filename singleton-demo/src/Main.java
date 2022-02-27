import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：hc
 * @date ：Created in 2022/2/27 21:41
 * @modified ：
 * 多线程环境下测试
 */
public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        // Singleton01是线程不安全的懒汉式
        for (int i=0; i<20; i++) {
            executorService.execute(Singleton01::getInstance);
        }

        // Singleton02是线程安全的懒汉式
        for (int i=0; i<20; i++) {
            executorService.execute(Singleton02::getInstance);
        }

        // Singleton03是饿汉式，线程安全
        for (int i=0; i<20; i++) {
            executorService.execute(Singleton03::getInstance);
        }

        // Singleton04是使用内部类实现单例，线程安全
        for (int i=0; i<20; i++) {
            executorService.execute(Singleton04::getInstance);
        }

    }
}
