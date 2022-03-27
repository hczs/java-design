package icu.sunnyc.demo.event;

import icu.sunnyc.demo.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 22:04
 * @modified ：
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n 元购 直接返回n元 固定价格购买
     * @param couponInfo 券折扣信息：直减、满减、折扣、n元购
     * @param skuPrice 商品金额
     * @return 直接返回n元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
