package icu.sunnyc.observerdemo;

import java.util.Date;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:10
 * @modified ：
 * 摇号结果通知实体类
 */
public class LotteryResult {

    private String uId;

    private String msg;

    private Date dateTime;

    public LotteryResult(String uId, String msg, Date dateTime) {
        this.uId = uId;
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
