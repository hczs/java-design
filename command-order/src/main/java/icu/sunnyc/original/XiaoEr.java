package icu.sunnyc.original;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ：hc
 * @date ：Created in 2022/3/13 21:50
 * @modified ：
 * 原始写法，不使用命令模式的情况
 * 后续如果添加菜品，用 if 不好维护
 */
public class XiaoEr {

    private final Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private final Map<Integer, String> cuisineMap = new ConcurrentHashMap<>();

    public void order(int cuisine) {
        // 广东（粤菜）
        if (1 == cuisine) {
            cuisineMap.put(1, "广东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
        }

        // 江苏（苏菜）
        if (2 == cuisine) {
            cuisineMap.put(2, "江苏厨师，烹饪苏菜，宫廷第二大菜系，古今国宴上最受人欢迎的菜系。");
        }
    }

    public void placeOrder() {
        Gson gson = new Gson();
        logger.info("菜单：{}", gson.toJson(cuisineMap));
    }

    public static void main(String[] args) {
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(1);
        xiaoEr.order(2);

        xiaoEr.placeOrder();
    }
}
