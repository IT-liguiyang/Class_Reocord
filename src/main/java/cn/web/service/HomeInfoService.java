package cn.web.service;

import com.github.pagehelper.PageInfo;

import cn.web.domain.HomeInfo;
import java.util.List;

public interface HomeInfoService {



    public PageInfo<HomeInfo> findAll(HomeInfo homeInfo, Integer pageNum, Integer pageSize);

    /**
     * 检查主键是否存在
     * @param key
     * @return
     */
    public List<HomeInfo> queryHomeInfoByPrimaryKey(String key);



    /**
     * 增加
     * @param  homeInfo
     */
    public void addHomeInfo(HomeInfo homeInfo);

    /**
     * 更新
     * @param  homeInfo
     */
    public void updateHomeInfo(HomeInfo homeInfo);

    /**
     * 删除
     * @param hno
     */
    public void deleteHomeInfo(String hno);
}
