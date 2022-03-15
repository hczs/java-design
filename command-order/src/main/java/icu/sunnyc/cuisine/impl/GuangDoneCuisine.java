package icu.sunnyc.cuisine.impl;

import icu.sunnyc.cook.ICook;
import icu.sunnyc.cuisine.ICuisine;

/**
 * @author ：hc
 * @date ：Created in 2022/3/13 21:37
 * @modified ：
 * 广东菜
 */
public class GuangDoneCuisine implements ICuisine {

    private final ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        this.cook.doCooking();
    }
}
