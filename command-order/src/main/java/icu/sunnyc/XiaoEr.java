package icu.sunnyc;

import icu.sunnyc.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：hc
 * @date ：Created in 2022/3/13 21:44
 * @modified ：
 * 小二，向厨师下达命令的
 */
public class XiaoEr {

    private final Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private final List<ICuisine> cuisineList = new ArrayList<>();

    /**
     * 客户点菜，小二加到做菜列表里
     * @param cuisine 菜系
     */
    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    /**
     * 客户点完菜了，小二告诉厨师可以做了
     */
    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }
}
