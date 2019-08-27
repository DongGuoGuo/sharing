package com.share.service;

import com.share.dao.IResourcesDao;
import com.share.domain.MyResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesService {
    @Autowired
    private IResourcesDao iResourcesDao;
    /**
     * 查询所有资源
     * @return
     */
    public List<MyResources> findAllResources(){
        try{
            return iResourcesDao.findAllResources();
        }catch (Exception e){
            return null;
        }
    }


    /**
     * 保存资源
     * @param resources
     */
    public boolean saveResources(MyResources resources){
        try{
            iResourcesDao.saveResources(resources);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 更新资源信息
     * @param resources
     */
    public boolean updataResources(MyResources resources){
        try{
            iResourcesDao.updataResources(resources);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 根据记录id删除资源
     * @param record_id
     */
    public boolean deleteResources(int record_id){
        try{
            iResourcesDao.deleteResources(record_id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     *根据id查询资源
     * @return
     */
    public List<MyResources> findByIdone(int record_id){
        try{
            return iResourcesDao.findByIdone(record_id);
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 根据资源名字模糊搜索
     * @param res_name
     * @return
     */
    public List<MyResources> findByNamemohu(String res_name){
        try{
            return iResourcesDao.findByNamemohu(res_name);
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 查询总条数
     * @return
     */
    public int findTotal(){
        try{
            return iResourcesDao.findTotal();
        }catch (Exception e){
            return 0;
        }
    }
}
