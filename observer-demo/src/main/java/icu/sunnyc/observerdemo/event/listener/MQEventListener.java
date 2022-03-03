package icu.sunnyc.observerdemo.event.listener;

import icu.sunnyc.observerdemo.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:21
 * @modified ：
 * MQ推送事件
 */
public class MQEventListener implements EventListener {

    private final Logger logger = LoggerFactory.getLogger(MQEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("记录用户 {} 摇号结果（MQ）为：{}", result.getuId(), result.getMsg());
    }
}
