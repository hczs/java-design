import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ：hc
 * @date ：Created in 2022/2/27 21:33
 * @modified ：
 * 静态类使用
 * 在不需要维持任何状态下，仅仅用于全局访问，这个使用使用静态类的方式更加方便。
 * 但如果需要被继承以及需要维持一些特定状态的情况下，就适合使用单例模式。
 */
public class Singleton00 {

   public static Map<String,String> cache  = new ConcurrentHashMap<>();

}
