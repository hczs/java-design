/**
 * @author ：hc
 * @date ：Created in 2022/2/27 22:12
 * @modified ：
 * 饿汉式 线程安全
 * 缺点，不是懒加载，程序启动就会创建实例对象，占内存资源
 */
public class Singleton03 {
    private static final Singleton03 INSTANCE = new Singleton03();

    private Singleton03() {
        System.out.println("Singleton03实例化");
    }

    public static Singleton03 getInstance() {
        return INSTANCE;
    }
}
