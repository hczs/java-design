package icu.sunnyc.proxydemo.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ：hc
 * @date ：Created in 2022/2/19 19:38
 * @modified ：
 * 代理类
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private final Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

    /**
     * mapper接口 class
     */
    private final Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        // 这里就通过动态代理来生成代理类
        InvocationHandler handler = (proxy, method, args) -> {
            // 获取注解
            Select select = method.getAnnotation(Select.class);
            logger.info("args: {}", Arrays.toString(args));
            // 替换sql参数，打印
            logger.info("SQL: {}", select.value().replace("#{userId}", args[0].toString()));
            return "成功！";
        };
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
