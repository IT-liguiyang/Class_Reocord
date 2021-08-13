package cn.web.service;

import cn.web.domain.ActivityThought;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ActivityThoughtService {



    public PageInfo<ActivityThought> findAll(String atcontent,Integer pageNum,Integer pageSize);

    /**
     * 检查主键是否存在
     * @param key
     * @return
     */
    public List<ActivityThought> queryActivityByPrimaryKey(String key);



    /**
     * 增加
     * @param activityThought
     */
    public void addActivityThought(ActivityThought activityThought);

    /**
     * 更新
     * @param activityThought
     */
    public void updateActivityThought(ActivityThought activityThought);

    /**
     * 删除
     * @param atno
     */
    public void deleteActivityThought(String atno);
}
