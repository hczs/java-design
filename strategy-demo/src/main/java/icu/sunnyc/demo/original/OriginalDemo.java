package icu.sunnyc.demo.original;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 20:36
 * @modified ：
 * 优惠券折扣计算
 * 优惠券类型
 * 1.直减券
 * 2.满减券
 * 3.折扣券
 * 4.n元购
 * 优惠券还有各种类型的算法，扩展性不能满足，比如满减，前三个参数并不能满足这个算法，所以只能添加一个 typeExt 参数，表示满减金额
 * 扩展性差、后期不好维护，所以需要使用策略模式
 */
public class OriginalDemo {
    /**
     * 优惠券折扣计算
     * @param type 优惠券类型
     * @param typeContent 优惠券金额
     * @param skuPrice 商品金额
     * @param typeExt 满减金额
     * @return 折扣后的价格
     */
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {
        // 直减券
        if (type == 1) {
            return skuPrice - typeContent;
        }
        // 满减券
        if (type == 2) {
            // 不够满减金额，还按原价处理
            if (skuPrice < typeExt) {
                return skuPrice;
            }
            return skuPrice - typeContent;
        }
        // 折扣券
        if (type == 3) {
            return skuPrice * typeContent;
        }
        // n元购
        if (type == 4) {
            return typeContent;
        }
        // 类型都没有匹配上，就按原价处理
        return skuPrice;
    }

}
