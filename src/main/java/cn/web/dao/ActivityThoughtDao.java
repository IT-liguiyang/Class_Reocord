package cn.web.dao;

import cn.web.domain.ActivityThought;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityThoughtDao {

    List<ActivityThought> queryActivityByPrimaryKey(String key);

    List<ActivityThought> findAll(@Param("atcontent") String atcontent);

    void addActivityThought(ActivityThought activityThought);

    void updateActivityThought(ActivityThought activityThought);

    void deleteActivityThought(String atno);
}
