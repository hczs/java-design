package icu.sunnyc.demo;

import java.math.BigDecimal;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 20:53
 * @modified ：
 *
 * 优惠券金额计算，顶层接口
 */
public interface ICouponDiscount<T> {


    /**
     * 优惠券金额计算
     * @param couponInfo 券折扣信息：直减、满减、折扣、n元购
     * @param skuPrice 商品金额
     * @param <T> 券折扣信息类型
     * @return 优惠后的金额
     */
     BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
