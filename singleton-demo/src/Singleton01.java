/**
 * @author ：hc
 * @date ：Created in 2022/2/27 21:41
 * @modified ：
 * 懒汉式 线程不安全
 */
public class Singleton01 {

    private static Singleton01 instance;

    private Singleton01() {
        System.out.println("Singleton01实例化");
    }

    public static Singleton01 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton01();
        return instance;
    }
}
