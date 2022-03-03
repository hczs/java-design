package icu.sunnyc.observerdemo.event.listener;

import icu.sunnyc.observerdemo.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:14
 * @modified ：
 * 发送信息提醒事件
 */
public class MessageEventListener implements EventListener {

    private final Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        // 实际业务逻辑
        logger.info("给用户 {} 发送短信通知：{}", result.getuId(), result.getMsg());
    }
}
