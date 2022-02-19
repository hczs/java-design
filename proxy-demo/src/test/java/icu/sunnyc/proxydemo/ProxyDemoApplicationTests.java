package icu.sunnyc.proxydemo;

import icu.sunnyc.proxydemo.agent.MapperFactoryBean;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class ProxyDemoApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(ProxyDemoApplicationTests.class);


    @Test
    void contextLoads() {
    }

    @Test
    public void testProxy() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        UserMapper userMapper = beanFactory.getBean("userMapper", UserMapper.class);
        String result = userMapper.selectUserById("haha");
        logger.info("测试结果：{}", result);
    }

}
