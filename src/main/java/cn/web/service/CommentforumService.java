package cn.web.service;

import cn.web.domain.Commentforum;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CommentforumService {



    public PageInfo<Commentforum> findAll(Commentforum commentforum, Integer pageNum, Integer pageSize);

    /**
     * 检查主键是否存在
     * @param key
     * @return
     */
    public List<Commentforum> queryCommentforumByPrimaryKey(String key);



    /**
     * 增加
     * @param   commentforum
     */
    public void addCommentforum(Commentforum commentforum);

    /**
     * 更新
     * @param   commentforum
     */
    public void updateCommentforum(Commentforum commentforum);

    /**
     * 删除
     * @param cfno
     */
    public void deleteCommentforum(String cfno);
}
