package icu.sunnyc.demo.event;

import icu.sunnyc.demo.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 22:00
 * @modified ：
 */
public class ZKCouponDiscount implements ICouponDiscount<Double> {
    /**
     * 折扣
     * 商品价格乘以折扣比例 就是最后支付金额
     * 保留两位小数
     * 最低支付1元
     * @param couponInfo 券折扣信息：直减、满减、折扣、n元购
     * @param skuPrice 商品金额
     * @return 折扣后的金额
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal result = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);
        if (result.compareTo(BigDecimal.ONE) < 1) {
            return BigDecimal.ONE;
        }
        return result;
    }
}
