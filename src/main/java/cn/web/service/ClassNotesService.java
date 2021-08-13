package cn.web.service;

import cn.web.domain.ClassNotes;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ClassNotesService {

    public PageInfo<ClassNotes> findAll(String cnsubject, Integer pageNum, Integer pageSize);

    public List<ClassNotes> queryByKey(String cnno);

    public void add(ClassNotes classNotes);

    public void update(ClassNotes classNotes);

    public void delete(String cnno);
}
