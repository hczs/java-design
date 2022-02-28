/**
 * @author ：hc
 * @date ：Created in 2022/2/28 21:25
 * @modified ：
 *
 * 对已有类改造为单例类，也可以用枚举
 */
public class Singleton072 {

    private Singleton072() {
        System.out.println("Singleton072实例化");
    }

    private enum SingletonEnum {
        /** 枚举对象 */
        INSTANCE;

        private final Singleton072 instance;

        SingletonEnum() {
            instance = new Singleton072();
        }

        private Singleton072 getInstance() {
            return instance;
        }
    }

    public static Singleton072 getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }
}
