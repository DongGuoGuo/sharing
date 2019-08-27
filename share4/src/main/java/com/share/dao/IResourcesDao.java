package com.share.dao;

import com.share.domain.MyResources;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IResourcesDao {
    /**
     * 查询所有资源
     * @return
     */
    @Select("select * from resources")
    List<MyResources> findAllResources();


    /**
     * 保存资源
     * @param resources
     */
    @Insert("insert into resources(res_name,res_info,res_link,res_password,network_disk,res_seed,res_username,res_uploadtime,res_indate) " +
            "values(#{res_name},#{res_info},#{res_link},#{res_password},#{network_disk},#{res_seed},#{res_username},#{res_uploadtime},#{res_indate})")
    void saveResources(MyResources resources);

    /**
     * 更新资源信息
     * @param resources
     */
    @Update("update resources set res_name=#{res_name},res_info=#{res_info},res_link=#{res_link},res_password=#{res_password}," +
            "network_disk=#{network_disk},res_seed=#{res_seed},res_uploadtime=#{res_uploadtime},res_indate=#{res_indate} where ires_usernamed = #{res_username}")
    void  updataResources(MyResources resources);

    /**
     * 根据记录id删除资源
     * @param record_id
     */
    @Delete("delete from resources where record_id = #{record_id}")
    void deleteResources(int record_id);

    /**
     *根据id查询用户
     * @return
     */
    @Select("select * from resources where record_id = #{record_id}")
    List<MyResources> findByIdone(int record_id);

    /**
     * 根据资源名字模糊搜索
     * @param res_name
     * @return
     */
    @Select("select * from resources where res_name like #{res_name}")
    List<MyResources> findByNamemohu(String res_name);

    /**
     * 查询总条数
     * @return
     */
    @Select("select count(*) from resources")
    int findTotal();
}
