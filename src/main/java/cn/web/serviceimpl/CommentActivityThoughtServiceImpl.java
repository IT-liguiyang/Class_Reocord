package cn.web.serviceimpl;

import cn.web.dao.CommentActivityThoughtDao;
import cn.web.domain.CommentActivityThought;
import cn.web.service.CommentActivityThoughtService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/CommentActivityThoughtService")
public class CommentActivityThoughtServiceImpl implements CommentActivityThoughtService {


    @Autowired
    private CommentActivityThoughtDao commentActivityThoughtDao;


    @Override
    public PageInfo<CommentActivityThought> findAll(CommentActivityThought commentActivityThought,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<CommentActivityThought> list = commentActivityThoughtDao.findAll(commentActivityThought);
        PageInfo<CommentActivityThought> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<CommentActivityThought> queryCommentActivityThoughtByPrimaryKey(String key) {
        return commentActivityThoughtDao.queryCommentActivityThoughtByPrimaryKey(key);
    }


    @Override
    public void addCommentActivityThought(CommentActivityThought commentActivityThought) {
        commentActivityThoughtDao.addCommentActivityThought(commentActivityThought);
    }

    @Override
    public void updateCommentActivityThought(CommentActivityThought commentActivityThought) {
        commentActivityThoughtDao.updateCommentActivityThought(commentActivityThought);
    }

    @Override
    public void deleteCommentActivityThought(String cano) {
        commentActivityThoughtDao.deleteCommentActivityThought(cano);
    }
}
