package icu.sunnyc.demo;

import icu.sunnyc.demo.chain.AbstractLogger;
import icu.sunnyc.demo.chain.DebugLogger;
import icu.sunnyc.demo.chain.ErrorLogger;
import icu.sunnyc.demo.chain.InfoLogger;

/**
 * @author: houcheng
 * @date: 2022/3/14 14:47:26
 * @description: 责任链模式测试类
 */
public class ChainPatternDemo {

    private static AbstractLogger getLoggerChain() {
        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();
        ErrorLogger errorLogger = new ErrorLogger();
        // info 下家是 debug 接手
        infoLogger.setNextLogger(debugLogger);
        // debug 下家 error 接手
        debugLogger.setNextLogger(errorLogger);
        // 责任链危险的地方，一个写不好就会循环调用，添加以下代码就会循环调用
        // errorLogger.setNextLogger(infoLogger);
        return infoLogger;
    }


    public static void main(String[] args) {
        AbstractLogger loggerChain = getLoggerChain();

        loggerChain.logMessage(LoggerType.INFO, "INFO 日志测试");
        loggerChain.logMessage(LoggerType.DEBUG, "DEBUG 日志测试");
        loggerChain.logMessage(LoggerType.ERROR, "ERROR 日志测试");
    }
}
