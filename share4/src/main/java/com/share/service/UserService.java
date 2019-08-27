package com.share.service;

import com.share.dao.IUserDao;
import com.share.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserDao iUserDao;

    /**
     * 查询自己个人信息
     * @param username
     * @return
     */
    public User findUserByUsername(String username){
        try {
            List<User> byUsername = iUserDao.findByUsername(username);
            if(byUsername.size()==1){
                return byUsername.get(0);
            }
            return null;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 用户更改个人信息
     * @param user
     * @return
     */
    public boolean updateUser(User user){
        try{
            iUserDao.updataUser(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
