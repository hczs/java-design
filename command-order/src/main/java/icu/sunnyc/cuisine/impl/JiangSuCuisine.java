package icu.sunnyc.cuisine.impl;

import icu.sunnyc.cook.ICook;
import icu.sunnyc.cuisine.ICuisine;

/**
 * @author ：hc
 * @date ：Created in 2022/3/13 21:39
 * @modified ：
 * 江苏菜
 */
public class JiangSuCuisine implements ICuisine {

    private final ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        this.cook.doCooking();
    }
}
