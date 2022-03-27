package icu.sunnyc.demo;

import icu.sunnyc.demo.event.MJCouponDiscount;
import icu.sunnyc.demo.event.NYGCouponDiscount;
import icu.sunnyc.demo.event.ZJCouponDiscount;
import icu.sunnyc.demo.event.ZKCouponDiscount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：hc
 * @date ：Created in 2022/3/27 22:07
 * @modified ：
 */
public class MainTest {

    public void zjTest() {
        // 直减
        Context<Double> context = new Context<>(new ZJCouponDiscount());
        BigDecimal result = context.discountAmount(10D, new BigDecimal("10.5"));
        System.out.println("直减策略，10.5 减 10：" + result);
    }

    public void mjTest() {
        // 满减
        Context<Map<String, String>> context = new Context<>(new MJCouponDiscount());
        HashMap<String, String> couponInfo = new HashMap<>();
        // 满 10.5 减 10 满 x 减 n
        couponInfo.put("x", "10.5");
        couponInfo.put("n", "10");
        BigDecimal result = context.discountAmount(couponInfo, new BigDecimal("10.5"));
        System.out.println("满减策略，满 10.5 减 10：" + result);
    }

    public void zkTest() {
        // 折扣
        Context<Double> context = new Context<>(new ZKCouponDiscount());
        BigDecimal result = context.discountAmount(0.1D, new BigDecimal("10.5"));
        System.out.println("折扣策略，10.5 打一折：" + result);
    }

    public void nyTest() {
        Context<Double> context = new Context<>(new NYGCouponDiscount());
        BigDecimal result = context.discountAmount(0.5D, new BigDecimal("10.5"));
        System.out.println("n元购策略：直接n元买下：" + result);
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.mjTest();
        mainTest.zjTest();
        mainTest.zkTest();
        mainTest.nyTest();
    }
}
