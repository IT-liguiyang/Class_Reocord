package cn.web.dao;

import cn.web.domain.Classes;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ClassesDao {

    List<Classes> findAll(@Param("grade") String grade);

    List<Classes> queryByKey(String cno);

    void add(Classes classes);

    void update(Classes classes);

    void delete(String cno);

    /**
     * 统计班级人数
     * @return
     */
    List<Map<String,Object>> countClassnum();

    /**
     * 统计各年级人数
     * @return
     */
    List<Map<String,Object>> countGradenum();

}
