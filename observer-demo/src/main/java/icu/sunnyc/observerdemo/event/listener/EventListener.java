package icu.sunnyc.observerdemo.event.listener;

import icu.sunnyc.observerdemo.LotteryResult;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:13
 * @modified ：
 */
public interface EventListener {

    /**
     * 基本事件
     * @param result LotteryResult
     */
    void doEvent(LotteryResult result);
}
