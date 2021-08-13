package cn.web.dao;

import cn.web.domain.Commentforum;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentforumDao {

    List<Commentforum> queryCommentforumByPrimaryKey(String key);

    List<Commentforum> findAll(Commentforum commentforum);

    void addCommentforum(Commentforum commentforum);

    void updateCommentforum(Commentforum commentforum);

    void deleteCommentforum(String cfno);
}
