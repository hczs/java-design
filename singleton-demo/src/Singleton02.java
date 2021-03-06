/**
 * @author ：hc
 * @date ：Created in 2022/2/27 21:54
 * @modified ：
 * 懒汉式 线程安全
 * 此种模式虽然是安全的，但由于把锁加到方法上后，所有的访问都因需要锁占用导致资源的浪费。
 * 如果不是特殊情况下，不建议此种方式实现单例模式。
 */
public class Singleton02 {

    private static Singleton02 instance;

    private Singleton02() {
        System.out.println("Singleton02实例化");
    }

    public static synchronized Singleton02 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton02();
        return instance;
    }
}
