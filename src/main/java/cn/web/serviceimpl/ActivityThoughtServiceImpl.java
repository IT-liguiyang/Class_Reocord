package cn.web.serviceimpl;

import cn.web.dao.ActivityThoughtDao;
import cn.web.domain.Activity;
import cn.web.domain.ActivityThought;
import cn.web.service.ActivityThoughtService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/ActivityThoughtService")
public class ActivityThoughtServiceImpl implements ActivityThoughtService {


    @Autowired
    private ActivityThoughtDao activityThoughtDao;


    @Override
    public PageInfo<ActivityThought> findAll(String atcontent,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<ActivityThought> list = activityThoughtDao.findAll(atcontent);
        PageInfo<ActivityThought> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<ActivityThought> queryActivityByPrimaryKey(String key) {
        return activityThoughtDao.queryActivityByPrimaryKey(key);
    }


    @Override
    public void addActivityThought(ActivityThought activityThought) {
        activityThoughtDao.addActivityThought(activityThought);
    }

    @Override
    public void updateActivityThought(ActivityThought activityThought) {
        activityThoughtDao.updateActivityThought(activityThought);
    }

    @Override
    public void deleteActivityThought(String atno) {
        activityThoughtDao.deleteActivityThought(atno);
    }
}
