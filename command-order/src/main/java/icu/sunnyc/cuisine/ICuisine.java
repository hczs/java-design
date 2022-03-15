package icu.sunnyc.cuisine;

/**
 * @author ：hc
 * @date ：Created in 2022/3/13 21:35
 * @modified ：
 * 菜系
 * 1.广东（粤菜）——国内民间第二大菜系，国外最有影响力的中国菜系，可以代表中国。
 * 2.江苏（苏菜）——宫廷第二大菜系，古今国宴上最受人欢迎的菜系。
 */
public interface ICuisine {

    /**
     * 烹调，具体的做饭逻辑（其实就是找具体的厨师做菜）
     */
    void cook();
}
