package cn.web.serviceimpl;

import cn.web.dao.ClassesDao;
import cn.web.domain.Classes;
import cn.web.service.ClassesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("/ClassesService")
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    public ClassesDao classesDao;

    @Override
    public PageInfo<Classes> findAll(String grade, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Classes> list = classesDao.findAll(grade);
        PageInfo<Classes> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Classes> queryByKey(String cno) {
        return classesDao.queryByKey(cno);
    }

    @Override
    public void add(Classes classes) {
        classesDao.add(classes);
    }

    @Override
    public void update(Classes classes) {
        classesDao.update(classes);
    }

    @Override
    public void delete(String cno) {
        classesDao.delete(cno);
    }

    @Override
    public List<Map<String, Object>> countClassnum() {
        return classesDao.countClassnum();
    }

    @Override
    public List<Map<String, Object>> countGradenum() {
        return classesDao.countGradenum();
    }
}
