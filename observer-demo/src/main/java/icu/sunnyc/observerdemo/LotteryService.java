package icu.sunnyc.observerdemo;

import icu.sunnyc.observerdemo.event.EventManager;
import icu.sunnyc.observerdemo.event.EventManager.EventType;
import icu.sunnyc.observerdemo.event.listener.MQEventListener;
import icu.sunnyc.observerdemo.event.listener.MessageEventListener;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:34
 * @modified ：
 * 摇号业务抽象类`
 */
public abstract class LotteryService {

    private final EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventType.MQ, EventType.Message);
        eventManager.subscribe(EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventType.Message, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult result = doDraw(uId);
        // 把结果通知推送到MQ
        eventManager.notify(EventType.MQ, result);
        // 把结果以短信息形式通知
        eventManager.notify(EventType.Message, result);
        return result;
    }

    /**
     * 摇号API
     * @param uId 用户id
     * @return LotteryResult
     */
    protected abstract LotteryResult doDraw(String uId);
}
