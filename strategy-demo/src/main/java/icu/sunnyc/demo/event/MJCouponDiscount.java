package icu.sunnyc.demo.event;

import icu.sunnyc.demo.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 20:57
 * @modified ：
 * 满减算法
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {

    /**
     * 满减计算，判断满 x 元后减去 n 元
     * 最低得支付 1 元
     * @param couponInfo 券折扣信息：直减、满减、折扣、n元购
     * @param skuPrice 商品金额
     * @return 满减后的价格
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String n = couponInfo.get("n");

        // 不够满减金额，直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }
        // 可以满减了
        BigDecimal result = skuPrice.subtract(new BigDecimal(n));
        // 最低支付 1 块钱
        if (result.compareTo(BigDecimal.ONE) < 0) {
            return BigDecimal.ONE;
        }
        return result;
    }
}
