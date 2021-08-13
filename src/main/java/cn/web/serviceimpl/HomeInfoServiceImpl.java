package cn.web.serviceimpl;

import cn.web.dao.HomeInfoDao;

import cn.web.domain.HomeInfo;
import cn.web.service.HomeInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/HomeInfoService")
public class HomeInfoServiceImpl implements HomeInfoService {


    @Autowired
    private HomeInfoDao homeInfoDao;


    @Override
    public PageInfo<HomeInfo> findAll(HomeInfo homeInfo,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<HomeInfo> list = homeInfoDao.findAll(homeInfo);
        PageInfo<HomeInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<HomeInfo> queryHomeInfoByPrimaryKey(String key) {
        return homeInfoDao.queryHomeInfoByPrimaryKey(key);
    }


    @Override
    public void addHomeInfo(HomeInfo homeInfo) {
        homeInfoDao.addHomeInfo(homeInfo);
    }

    @Override
    public void updateHomeInfo(HomeInfo homeInfo) {
        homeInfoDao.updateHomeInfo(homeInfo);
    }

    @Override
    public void deleteHomeInfo(String hno) {
        homeInfoDao.deleteHomeInfo(hno);
    }
}
