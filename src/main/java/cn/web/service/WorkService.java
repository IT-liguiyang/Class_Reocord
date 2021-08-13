package cn.web.service;

import com.github.pagehelper.PageInfo;
import cn.web.domain.Work;

import java.util.List;

public interface WorkService {


    public PageInfo<Work> findAll(Work work, Integer pageNum, Integer pageSize);

    /**
     * 检查主键是否存在
     *
     * @param key
     * @return
     */
    public List<Work> queryWorkByPrimaryKey(String key);


    /**
     * 增加
     *
     * @param work
     */
    public void addWork(Work work);

    /**
     * 更新
     *
     * @param work
     */
    public void updateWork(Work work);

    /**
     * 删除
     *
     * @param comno
     */
    public void deleteWork(String comno);
}
