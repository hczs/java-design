package icu.sunnyc.demo.event;

import icu.sunnyc.demo.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 21:54
 * @modified ：
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {

    /**
     * 直减
     * 直接减去优惠券的数值
     * 最低付一元
     * @param couponInfo 券折扣信息：直减、满减、折扣、n元购
     * @param skuPrice 商品金额
     * @return 优惠后的价格
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal result = skuPrice.subtract(new BigDecimal(couponInfo));
        // 可能是
        // 返回0 等于 1元
        // 返回-1 小于 1元
        // 返回1 大于 1元
        // 所以小于 1 就是（0 or -1） 小于等于 1 元
        if (result.compareTo(BigDecimal.ONE) < 1) {
            return BigDecimal.ONE;
        }
        return result;
    }
}
