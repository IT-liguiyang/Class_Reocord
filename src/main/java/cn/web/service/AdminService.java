package cn.web.service;

import cn.web.domain.Admin;

import java.util.List;

public interface AdminService {

    public List<Admin> checkLogin(Admin admin);
}
