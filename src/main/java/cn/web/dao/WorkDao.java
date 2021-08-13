package cn.web.dao;

import org.springframework.stereotype.Repository;
import cn.web.domain.Work;
import java.util.List;

@Repository
public interface WorkDao {

    List<Work> queryWorkByPrimaryKey(String key);

    List<Work> findAll(Work work);

    void addWork(Work work);

    void updateWork(Work work);

    void deleteWork(String comno);
}
