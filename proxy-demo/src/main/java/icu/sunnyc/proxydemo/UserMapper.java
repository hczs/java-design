package icu.sunnyc.proxydemo;

import icu.sunnyc.proxydemo.agent.Select;

/**
 * @author ：hc
 * @date ：Created in 2022/2/19 19:35
 * @modified ：
 */
public interface UserMapper {

    /**
     * 根据userId查询user
     * @param userId userId
     * @return String
     */
    @Select("select * from user where id = #{userId}")
    String selectUserById(String userId);
}
