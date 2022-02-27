/**
 * @author ：hc
 * @date ：Created in 2022/2/27 22:22
 * @modified ：
 * 双重校验锁 线程安全
 * 是懒汉式方法级锁的优化版本，减少了部分获取实例的耗时
 * 满足懒加载
 */
public class Singleton05 {
    private static volatile Singleton05 instance;

    private Singleton05() {
        System.out.println("Singleton05实例化");
    }

    public static Singleton05 getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton05.class) {
            if (null == instance) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
