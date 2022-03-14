package icu.sunnyc.demo.chain;

import icu.sunnyc.demo.LoggerType;

/**
 * @author: houcheng
 * @date: 2022/3/14 15:37:35
 * @description: INFO类型日志打印
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        this.loggerType = LoggerType.INFO;
    }

    @Override
    protected void outputMessage(String message) {
        System.out.println("INFO -- " + message);
    }
}
