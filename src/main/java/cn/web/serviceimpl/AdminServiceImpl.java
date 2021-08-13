package cn.web.serviceimpl;

import cn.web.dao.AdminDao;
import cn.web.domain.Admin;
import cn.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Admin> checkLogin(Admin admin) {
        return adminDao.checkLogin(admin);
    }
}
