package cn.web.serviceimpl;

import cn.web.dao.StudentDao;
import cn.web.domain.Student;
import cn.web.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/StudentService")
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao studentDao;


    @Override
    public PageInfo<Student> findAll(Student student,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Student> list = studentDao.findAll(student);
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Student> queryStudentByPrimaryKey(String key) {
        return studentDao.queryStudentByPrimaryKey(key);
    }


    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(String username) {
        studentDao.deleteStudent(username);
    }
}
