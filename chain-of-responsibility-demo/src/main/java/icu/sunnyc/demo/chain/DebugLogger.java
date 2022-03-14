package icu.sunnyc.demo.chain;

import icu.sunnyc.demo.LoggerType;

/**
 * @author: houcheng
 * @date: 2022/3/14 15:45:21
 * @description: debug类型日志打印器
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger() {
        this.loggerType = LoggerType.DEBUG;
    }

    @Override
    protected void outputMessage(String message) {
        System.out.println("DEBUG -- " + message);
    }
}
