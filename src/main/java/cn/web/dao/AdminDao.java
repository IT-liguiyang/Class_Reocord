package cn.web.dao;

import cn.web.domain.Admin;
import cn.web.domain.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {

    @Select("select * from Admin where adno=#{adno} and password=#{password}")
    public List<Admin> checkLogin(Admin admin);
}
