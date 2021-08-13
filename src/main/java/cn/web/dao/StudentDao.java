package cn.web.dao;

import cn.web.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

    List<Student> queryStudentByPrimaryKey(String key);

    List<Student> findAll(Student student);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(String username);
}
