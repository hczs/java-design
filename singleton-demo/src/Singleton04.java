/**
 * @author ：hc
 * @date ：Created in 2022/2/27 22:17
 * @modified ：
 * 使用内部类，线程安全，推荐使用
 * 因为用的时候直接加载内部类，jvm可以保证多线程下类的<clinit>只会执行一次，其他线程都会阻塞等待
 */
public class Singleton04 {

    private static class SingletonHolder {
        private static final Singleton04 INSTANCE = new Singleton04();
    }

    private Singleton04() {
        System.out.println("Singleton04实例化");
    }

    public static Singleton04 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
