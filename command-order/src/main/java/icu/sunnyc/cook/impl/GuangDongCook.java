package icu.sunnyc.cook.impl;

import icu.sunnyc.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：hc
 * @date ：Created in 2022/3/13 21:40
 * @modified ：
 * 广东厨师
 */
public class GuangDongCook implements ICook {

    private final Logger logger = LoggerFactory.getLogger(GuangDongCook.class);

    @Override
    public void doCooking() {
        logger.info("广东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
