package icu.sunnyc.observerdemo;

import java.util.Date;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:43
 * @modified ：
 */
public class LotteryServiceImpl extends LotteryService {

    private final MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
