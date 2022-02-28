/**
 * @author ：hc
 * @date ：Created in 2022/2/28 21:09
 * @modified ：
 * 枚举实现单例 Effective Java作者推荐
 * Effective Java 作者推荐使用枚举的方式解决单例模式，此种方式可能是平时最少用到的。
 * 这种方式解决了最主要的；线程安全、自由串行化、单一实例。
 */
public enum Singleton071 {
    /** 实例 */
    INSTANCE;

    public void businessMethod() {
        System.out.println("业务方法~");
    }

    public static void main(String[] args) {
        Singleton071 instance = Singleton071.INSTANCE;
        Singleton071 instance1 = Singleton071.INSTANCE;
        // true
        System.out.println(instance1 == instance);
    }
}
