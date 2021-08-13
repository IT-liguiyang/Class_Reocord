package cn.web.service;

import cn.web.domain.CommentActivityThought;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CommentActivityThoughtService {



    public PageInfo<CommentActivityThought> findAll(CommentActivityThought commentActivityThought, Integer pageNum, Integer pageSize);

    /**
     * 检查主键是否存在
     * @param key
     * @return
     */
    public List<CommentActivityThought> queryCommentActivityThoughtByPrimaryKey(String key);



    /**
     * 增加
     * @param  commentActivityThought
     */
    public void addCommentActivityThought(CommentActivityThought commentActivityThought);

    /**
     * 更新
     * @param  commentActivityThought
     */
    public void updateCommentActivityThought(CommentActivityThought commentActivityThought);

    /**
     * 删除
     * @param cano
     */
    public void deleteCommentActivityThought(String cano);
}
