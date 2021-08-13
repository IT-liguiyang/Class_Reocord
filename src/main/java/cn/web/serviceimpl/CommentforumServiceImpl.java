package cn.web.serviceimpl;

import cn.web.dao.CommentforumDao;
import cn.web.domain.Commentforum;
import cn.web.service.CommentforumService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/CommentforumService")
public class CommentforumServiceImpl implements CommentforumService {


    @Autowired
    private CommentforumDao commentforumDao;


    @Override
    public PageInfo<Commentforum> findAll(Commentforum commentforum,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Commentforum> list = commentforumDao.findAll(commentforum);
        PageInfo<Commentforum> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Commentforum> queryCommentforumByPrimaryKey(String key) {
        return commentforumDao.queryCommentforumByPrimaryKey(key);
    }


    @Override
    public void addCommentforum(Commentforum commentforum) {
        commentforumDao.addCommentforum(commentforum);
    }

    @Override
    public void updateCommentforum(Commentforum commentforum) {
        commentforumDao.updateCommentforum(commentforum);
    }

    @Override
    public void deleteCommentforum(String cfno) {
        commentforumDao.deleteCommentforum(cfno);
    }
}
