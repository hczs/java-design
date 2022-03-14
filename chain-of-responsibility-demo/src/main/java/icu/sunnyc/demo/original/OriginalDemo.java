package icu.sunnyc.demo.original;

import icu.sunnyc.demo.LoggerType;

/**
 * @author: houcheng
 * @date: 2022/3/14 14:49:22
 * @description: 不适用责任链模式的demo
 * 场景：根据传入的参数，来控制输出日志的类型
 */
public class OriginalDemo {

    private void logMessage(LoggerType loggerType, String message) {
        if (loggerType == LoggerType.INFO) {
            System.out.println("INFO -- " + message);
        } else if (loggerType == LoggerType.DEBUG) {
            System.out.println("DEBUG -- " + message);
        } else if (loggerType == LoggerType.ERROR) {
            System.out.println("ERROR -- " + message);
        } else {
            System.out.println("无法识别日志类型：" + loggerType);
        }
    }

    public static void main(String[] args) {
        OriginalDemo originalDemo = new OriginalDemo();
        originalDemo.logMessage(LoggerType.INFO, "INFO 日志");
        originalDemo.logMessage(LoggerType.DEBUG, "DEBUG 日志");
        originalDemo.logMessage(LoggerType.ERROR, "ERROR 日志");
    }

}
