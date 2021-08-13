package cn.web.serviceimpl;

import cn.web.dao.ActivityDao;
import cn.web.domain.Activity;
import cn.web.domain.Student;
import cn.web.service.ActivityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/ActivityService")
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityDao activityDao;

    @Override
    public PageInfo<Activity> findAll(String aplace,Integer pageNum,Integer pageSize) {
/*        return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->{
            activityDao.findAll(activity);
        });*/
        PageHelper.startPage(pageNum,pageSize);
        List<Activity> list = activityDao.findAll(aplace);
        PageInfo<Activity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Activity> queryActivityByAno(String ano) {
        return activityDao.queryActivityByAno(ano);
    }

    @Override
    public void addActivity(Activity activity) {
        activityDao.addActivity(activity);
    }

    @Override
    public void updateActivity(Activity activity) {
        activityDao.updateActivity(activity);
    }

    @Override
    public void deleteActivity(String ano) {activityDao.deleteActivity(ano); }

}
