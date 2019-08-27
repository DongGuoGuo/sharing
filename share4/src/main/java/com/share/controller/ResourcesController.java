package com.share.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.share.domain.MyResources;
import com.share.domain.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping(path = "resourcesService")
public class ResourcesController {
    @Autowired
    private ResourcesController resourcesController;
    @Autowired
    private ObjectMapper mapper;


    /**
     * 向前端返回josn数据结果集
     * @param resultObject
     * @param response
     * @throws Exception
     */
    private void Returnresult(ResultObject resultObject, HttpServletResponse response) throws Exception {


        String json = mapper.writeValueAsString(resultObject);
        System.out.println("json:" + json);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }



    /**
     * 查询所有资源
     * @return
     */
    public void findAllResources(){
        try{
            resourcesController.findAllResources();

        }catch (Exception e){

        }
    }


    /**
     * 保存资源
     * @param resources
     */
    public void saveResources(MyResources resources){
        try{

        }catch (Exception e){

        }
    }

    /**
     * 更新资源信息
     * @param resources
     */
    public void updataResources(MyResources resources){
        try{

        }catch (Exception e){

        }
    }

    /**
     * 根据记录id删除资源
     * @param record_id
     */
    public void deleteResources(int record_id){
        try{

        }catch (Exception e){

        }
    }

    /**
     *根据id查询用户
     * @return
     */
    public void findByIdone(int record_id){
        try{

        }catch (Exception e){

        }
    }

    /**
     * 根据资源名字模糊搜索
     * @param res_name
     * @return
     */
    public void findByNamemohu(String res_name){
        try{

        }catch (Exception e){

        }
    }

    /**
     * 查询总条数
     * @return
     */
    public void findTotal(){
        try{

        }catch (Exception e){

        }
    }
}
