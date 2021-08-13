package cn.web.serviceimpl;

import cn.web.dao.ClassNotesDao;
import cn.web.domain.ClassNotes;
import cn.web.domain.Classes;
import cn.web.service.ClassNotesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/NotesService")
public class ClassNotesServiceImpl implements ClassNotesService {

    @Autowired
    public ClassNotesDao classNotesDao;

    @Override
    public PageInfo<ClassNotes> findAll(String cnsubject, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<ClassNotes> list = classNotesDao.findAll(cnsubject);
        PageInfo<ClassNotes> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<ClassNotes> queryByKey(String cnno) {
        return classNotesDao.queryByKey(cnno);
    }

    @Override
    public void add(ClassNotes classNotes) {
        classNotesDao.add(classNotes);
    }

    @Override
    public void update(ClassNotes classNotes) {
        classNotesDao.update(classNotes);
    }

    @Override
    public void delete(String cnno) {
        classNotesDao.delete(cnno);
    }
}
