package cn.web.dao;

import cn.web.domain.CommentActivityThought;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentActivityThoughtDao {

    List<CommentActivityThought> queryCommentActivityThoughtByPrimaryKey(String key);

    List<CommentActivityThought> findAll(CommentActivityThought commentActivityThought);

    void addCommentActivityThought(CommentActivityThought commentActivityThought);

    void updateCommentActivityThought(CommentActivityThought commentActivityThought);

    void deleteCommentActivityThought(String cano);
}
