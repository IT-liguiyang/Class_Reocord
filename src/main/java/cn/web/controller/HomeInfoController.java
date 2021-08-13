package cn.web.controller;

import cn.web.service.HomeInfoService;
import com.github.pagehelper.PageInfo;
import cn.web.domain.HomeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/homeinfo")
public class HomeInfoController {

    @Autowired
    private HomeInfoService homeInfoService;

    /**
     * 分页查询
     * @param model
     * @param homeInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, HomeInfo homeInfo, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<HomeInfo> pageInfo = homeInfoService.findAll(homeInfo,pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "homeinfolist";

    }

    @RequestMapping("/queryKey")
    public String queryKey(String hno,Model model){
        List<HomeInfo> homeinfoList = homeInfoService.queryHomeInfoByPrimaryKey(hno);
        model.addAttribute("homeinfoList",homeinfoList);
        return "updateHomeInfo";
    }

    /**
     * 添加
     * @param homeInfo
     * @return
     */
    @PostMapping("/addhomeinfo")
    public String addHomeInfo(HomeInfo homeInfo) {
        List<HomeInfo> homeInfos = homeInfoService.queryHomeInfoByPrimaryKey(homeInfo.getHno());
        if (homeInfos.isEmpty()){
            homeInfoService.addHomeInfo(homeInfo);
            return "redirect:findall";
        }else
            return "redirect:/error";


    }

    /**
     * 更新
     * @param homeInfo
     * @return
     */
    @RequestMapping("/update")
    public String update(HomeInfo homeInfo){
        homeInfoService.updateHomeInfo(homeInfo);
        return "redirect:findall";
    }

    /**
     *
     * @param hno
     * @return
     */
    @RequestMapping("/delete")
    public String deletehomeinfo(String hno)  {
        homeInfoService.deleteHomeInfo(hno);
        return "redirect:findall";
    }

}
