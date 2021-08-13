package cn.web.service;

import cn.web.domain.Student;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface StudentService {



    public PageInfo<Student> findAll(Student student, Integer pageNum, Integer pageSize);

    /**
     * 检查主键是否存在
     * @param key
     * @return
     */
    public List<Student> queryStudentByPrimaryKey(String key);



    /**
     * 增加
     * @param  student
     */
    public void addStudent(Student student);

    /**
     * 更新
     * @param  student
     */
    public void updateStudent(Student student);

    /**
     * 删除
     * @param username
     */
    public void deleteStudent(String username);
}
