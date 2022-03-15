package icu.sunnyc;

import icu.sunnyc.cook.impl.GuangDongCook;
import icu.sunnyc.cook.impl.JiangSuCook;
import icu.sunnyc.cuisine.impl.GuangDoneCuisine;
import icu.sunnyc.cuisine.impl.JiangSuCuisine;

/**
 * @author ：hc
 * @date ：Created in 2022/3/13 21:47
 * @modified ：
 * 测试类
 * 后续如果加菜品，只需要创建对应菜的类和厨师，然后 new 出来就可以点单了
 */
public class MainTest {

    public static void main(String[] args) {
        // 菜系 + 厨师
        GuangDoneCuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());

        // 点菜
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);

        // 下单 厨师开始做菜
        xiaoEr.placeOrder();
    }
}
