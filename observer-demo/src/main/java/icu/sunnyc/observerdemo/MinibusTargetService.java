package icu.sunnyc.observerdemo;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:44
 * @modified ：
 */
public class MinibusTargetService {

    /**
     * 模拟摇号
     * @param uId 用户id
     * @return 结果字符串信息
     */
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ?
                "恭喜你，编码".concat(uId).concat("在本次摇号中签") :
                "很遗憾，编码".concat(uId).concat("在本次摇号未中签或摇号资格已过期");
    }
}
