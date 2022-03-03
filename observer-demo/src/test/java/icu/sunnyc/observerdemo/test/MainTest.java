package icu.sunnyc.observerdemo.test;

import com.google.gson.Gson;
import icu.sunnyc.observerdemo.LotteryResult;
import icu.sunnyc.observerdemo.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：hc
 * @date ：Created in 2022/3/3 21:50
 * @modified ：
 */
public class MainTest {

    private final Logger logger = LoggerFactory.getLogger(MainTest.class);


    @Test
    public void testLottery() {
        Gson gson = new Gson();
        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("123123123");
        logger.info("测试结果：{}", gson.toJson(result));
    }
}
