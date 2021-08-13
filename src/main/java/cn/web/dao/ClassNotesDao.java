package cn.web.dao;

import cn.web.domain.ClassNotes;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassNotesDao {

    List<ClassNotes> findAll(@Param("cnsubject") String cnsubject);

    List<ClassNotes> queryByKey(String cnno);

    void add(ClassNotes classNotes);

    void update(ClassNotes classNotes);

    void delete(String cnno);
}
