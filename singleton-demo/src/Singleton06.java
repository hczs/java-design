import java.util.concurrent.atomic.AtomicReference;

/**
 * @author ：hc
 * @date ：Created in 2022/2/27 22:26
 * @modified ：
 * CAS「AtomicReference」(线程安全)
 * 但是会创建多个对象 TODO
 */
public class Singleton06 {

    private static final AtomicReference<Singleton06> INSTANCE = new AtomicReference<>();

    private static Singleton06 instance;

    private Singleton06() {
        System.out.println("Singleton06实例化");
    }

    public static final Singleton06 getInstance() {
        for (; ;) {
            Singleton06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton06());
            return INSTANCE.get();
        }
    }
}
