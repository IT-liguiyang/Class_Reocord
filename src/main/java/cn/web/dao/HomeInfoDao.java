package cn.web.dao;

import org.springframework.stereotype.Repository;

import cn.web.domain.HomeInfo;
import java.util.List;

@Repository
public interface HomeInfoDao {

    List<HomeInfo> queryHomeInfoByPrimaryKey(String key);

    List<HomeInfo> findAll(HomeInfo homeInfo);

    void addHomeInfo(HomeInfo homeInfo);

    void updateHomeInfo(HomeInfo homeInfo);

    void deleteHomeInfo(String hno);
}
