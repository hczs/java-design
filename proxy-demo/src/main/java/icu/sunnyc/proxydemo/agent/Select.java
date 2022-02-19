package icu.sunnyc.proxydemo.agent;

import java.lang.annotation.*;

/**
 * @author ：hc
 * @date ：Created in 2022/2/19 19:33
 * @modified ：
 * 用于方法上的注解，value中放sql语句，获取具体的语句
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    String value() default "";
}
