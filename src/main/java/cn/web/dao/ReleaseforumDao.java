package cn.web.dao;

import cn.web.domain.Releaseforum;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReleaseforumDao {

    List<Releaseforum> queryReleaseforumByPrimaryKey(String key);

    List<Releaseforum> findAll(Releaseforum releaseforum);

    void addReleaseforum(Releaseforum releaseforum);

    void updateReleaseforum(Releaseforum releaseforum);

    void deleteReleaseforum(String rno);
}
