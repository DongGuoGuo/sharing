package com.share.dao;

import com.share.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    /**
     * 查询所有用户名
     * @return
     */
    @Select("select username from users")
    List<String> findAllName();

    /**
     * 查询所有邮箱地址
     * @return
     */
    @Select("select email from users")
    List<String> findAllEmail();


    /**
     * 查询根据用户名查询用户    用于登陆
     * @return
     */
    @Select("select * from users where username = #{username}")
    List<User> findByUsername(String username);

    /**
     * 查询根据邮箱查询用户  用于登陆
     * @return
     */
    @Select("select * from users where email = #{email}")
    List<User> findByEmail(String email);


    /**
     * 保存用户
     * @param user
     */
    @Insert("insert into users(username,password,nickname,email,status,code) values(#{username},#{password},#{nickname},#{email},#{status},#{code})")
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    @Update("update users set password=#{password},nickname=#{nickname},email=#{email} where username=#{username}")
    void  updataUser(User user);


}
