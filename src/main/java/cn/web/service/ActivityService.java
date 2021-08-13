package cn.web.service;

import cn.web.domain.Activity;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface ActivityService {


    /**
     * 分页模糊查询
     * @param aplace 条件
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return
     */
    public PageInfo<Activity> findAll(String aplace,Integer pageNum,Integer pageSize);

    /**
     * 查询主键是否存在
     * @param ano
     * @return
     */
    public List<Activity> queryActivityByAno(String ano);

    /**
     * 增加一个Activity
     * @param activity
     */
    public void addActivity(Activity activity);


    /**
     * 更新
     * @param activity
     */
    public void updateActivity(Activity activity);

    /**
     * 根据输入的ano删除一个Activity
     * @param ano
     */
    public void deleteActivity(String ano);



}
