package icu.sunnyc.observerdemo.event;

import icu.sunnyc.observerdemo.LotteryResult;
import icu.sunnyc.observerdemo.event.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:23
 * @modified ：
 * 事件处理类
 */
public class EventManager {

    /**
     * 存放 事件类型 和对应的 事件监听者们（list）
     */
    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    @SafeVarargs
    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public enum EventType {
        /** MQ类型 */
        MQ,
        /** 短信息类型 */
        Message
    }

    /**
     * 订阅
     * @param eventType 事件类型
     * @param eventListener 监听
     */
    public void subscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.add(eventListener);
    }

    /**
     * 取消监听
     * @param eventType 事件类型
     * @param eventListener 监听
     */
    public void unsubscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(eventListener);
    }

    /**
     * 通知
     * @param eventType 事件类型
     * @param result 结果
     */
    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> eventListeners = listeners.get(eventType);
        for (EventListener eventListener : eventListeners) {
            eventListener.doEvent(result);
        }
    }


}
