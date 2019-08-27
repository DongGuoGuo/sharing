package com.share.service;

import com.share.Utils.Sendmail;
import com.share.Utils.UuidUtil;
import com.share.dao.IUserDao;
import com.share.domain.ResultObject;
import com.share.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisInterceptUserService {
    @Autowired
    private IUserDao iUserDao;

    /**
     * 用户注册，返回结果对象
     * @param user
     * @return ResultObject结果
     */
    public ResultObject registerUser(User user){
        System.out.println("zhuce"+user);
        ResultObject resultObject=new ResultObject();
        if(user.getUsername().equals("")||user.getEmail().equals("")){
            resultObject.setResult(false);
            resultObject.setMsg("用户注册失败，填写的内容不规范");
        }else {
            user.setStatus("N");
            user.setCode(UuidUtil.getUuid());

            String subject="资源分享网新用户激活验证";
            String content="请点击下面的链接激活用户。http://22683cf223.imwork.net:26847/userActivate?username="+user.getUsername()+"&code="+user.getCode();
            //模拟保存用户
            System.out.println("用户保存 ："+user);
            try {
                Sendmail sendmail=new Sendmail();
                sendmail.Send(subject,content,user.getEmail());
                try{
                    iUserDao.saveUser(user);
                    resultObject.setResult(true);
                }catch (Exception a){
                    //删除掉刚刚保存的信息
                }
            }catch (Exception e){
                System.out.println("保存出错了");
                resultObject.setResult(false);
                resultObject.setMsg("用户注册失败，请稍后重试");
            }
        }
        return resultObject;
    }

    /**
     * 用户激活
     * @param username
     * @param code
     * @return
     */
    public ResultObject activateUser(String username, String code){
        ResultObject resultObject=new ResultObject();

        List<User> byUsername = iUserDao.findByUsername(username);
        if(byUsername.size()==1){
            if(byUsername.get(0).getCode().equals(code)){
                byUsername.get(0).setStatus("Y");
                iUserDao.saveUser(byUsername.get(0));
                resultObject.setResult(true);
            }else {
                resultObject.setResult(false);
                resultObject.setMsg("此链接已经失效或者错误");
            }
        }
        return resultObject;
    }


    /**
     * 用户登陆 判断是否存在该用户
     * @return
     */
    public boolean isUser(String user,String password){
        User byUsername = findByUsername(user);
        if(byUsername!=null){
            if(byUsername.getPassword().equals(password)){
                return true;
            }
        }else {
            User byEmail = findByEmail(user);
            if (byEmail!=null){
                if (byEmail.getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 根据用户名查找用户   用于登录
     * @param username
     * @return
     */
    public User findByUsername(String username){
        List<User> byUsername = iUserDao.findByUsername(username);
        if (byUsername.size()==1){
            System.out.println("据用户名查找用户"+username);
            return byUsername.get(0);
        }
        return null;
    }

    /**
     * 根据邮箱查找用户   用于登录
     * @param email
     * @return
     */
    public User findByEmail(String email){
        List<User> byEmail = iUserDao.findByEmail(email);
        if (byEmail.size()==1){
            return byEmail.get(0);
        }
        return null;
    }


    /**
     * 查找所有的用户名
     * @return
     */
    public List<String> findAllUsername(){
        System.out.println("Service层");
        List<String> allName = iUserDao.findAllName();
        for (String s:allName){
            System.out.println(s);
        }
        return allName;
    }

    /**
     * 查找所有的邮箱地址
     * @return
     */
    public List<String> findAllEmail(){
        System.out.println("Service层");
        List<String> allEmail = iUserDao.findAllEmail();
        for (String s:allEmail){
            System.out.println(s);
        }
        return allEmail;
    }

}
