package icu.sunnyc.demo.chain;

import icu.sunnyc.demo.LoggerType;

/**
 * @author: houcheng
 * @date: 2022/3/14 15:46:18
 * @description: error类型日志打印器
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        this.loggerType = LoggerType.ERROR;
    }

    @Override
    protected void outputMessage(String message) {
        System.out.println("ERROR -- " + message);
    }
}
