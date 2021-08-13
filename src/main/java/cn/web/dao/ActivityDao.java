package cn.web.dao;

import cn.web.domain.Activity;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityDao {

    /**
     * 模糊查询所有的Activity
     * @param aplace
     * @return
     */
    List<Activity> findAll(@Param("aplace")String aplace);

    /**
     * 根据Ano查询Activity
     * @param ano
     * @return
     */
    List<Activity> queryActivityByAno(String ano);

    /**
     * 增加一个Activity
     * @param activity
     */
    void addActivity(Activity activity);

    /**
     * 更新
     * @param activity
     */
    void updateActivity(Activity activity);

    /**
     * 根据输入的ano删除一个Activity
     * @param ano
     */
    void deleteActivity(String ano);
}
