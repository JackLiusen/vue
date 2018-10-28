package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    /**
     * 查找所有
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 通过id查
     * @param id
     * @return
     */
    @Select("select * from user where id =#{id}")
    User findById(Integer id);

    /**
     * 修改
     * @param user
     */
    @Update("update user set username = #{username},password = #{password},age = #{age},sex = #{sex},email = #{email} where id = #{id}")
    void updateUser(User user);
}
