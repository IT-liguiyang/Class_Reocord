package cn.web.serviceimpl;

import cn.web.dao.WorkDao;
import cn.web.domain.Work;
import cn.web.service.WorkService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/WorkService")
public class WorkServiceImpl implements WorkService {


    @Autowired
    private WorkDao workDao;


    @Override
    public PageInfo<Work> findAll(Work work, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Work> list = workDao.findAll(work);
        PageInfo<Work> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Work> queryWorkByPrimaryKey(String key) {
        return workDao.queryWorkByPrimaryKey(key);
    }


    @Override
    public void addWork(Work work) {
        workDao.addWork(work);
    }

    @Override
    public void updateWork(Work work) {
        workDao.updateWork(work);
    }

    @Override
    public void deleteWork(String comno) {
        workDao.deleteWork(comno);
    }
}
