package icu.sunnyc.demo;

import java.math.BigDecimal;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 22:05
 * @modified ：
 * 策略控制类
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
