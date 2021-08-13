package cn.web.service;

import cn.web.domain.Classes;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface ClassesService {

    public PageInfo<Classes> findAll(String grade, Integer pageNum, Integer pageSize);

    public List<Classes> queryByKey(String cno);

    public void add(Classes classes);

    public void update(Classes classes);

    public void delete(String cno);

    public List<Map<String, Object>> countClassnum();

    public List<Map<String,Object>> countGradenum();

}
