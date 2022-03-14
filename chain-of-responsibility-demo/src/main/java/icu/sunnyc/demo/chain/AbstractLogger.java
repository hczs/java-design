package icu.sunnyc.demo.chain;

import icu.sunnyc.demo.LoggerType;

/**
 * @author: houcheng
 * @date: 2022/3/14 15:24:17
 * @description: 日志链顶层抽象类
 */
public abstract class AbstractLogger {

    protected LoggerType loggerType;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(LoggerType loggerType, String message) {
        if (loggerType == this.loggerType) {
            outputMessage(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(loggerType, message);
        }
    }

    /**
     * 实际输出日志逻辑
     * @param message 日志信息
     */
    abstract protected void outputMessage(String message);
}
