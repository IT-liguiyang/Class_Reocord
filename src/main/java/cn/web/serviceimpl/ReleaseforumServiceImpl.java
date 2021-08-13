package cn.web.serviceimpl;

import cn.web.dao.ReleaseforumDao;
import cn.web.domain.Releaseforum;
import cn.web.service.ReleaseforumService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/ReleaseforumService")
public class ReleaseforumServiceImpl implements ReleaseforumService {


    @Autowired
    private ReleaseforumDao releaseforumDao;


    @Override
    public PageInfo<Releaseforum> findAll(Releaseforum releaseforum,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Releaseforum> list = releaseforumDao.findAll(releaseforum);
        PageInfo<Releaseforum> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Releaseforum> queryReleaseforumByPrimaryKey(String key) {
        return releaseforumDao.queryReleaseforumByPrimaryKey(key);
    }


    @Override
    public void addReleaseforum(Releaseforum releaseforum) {
        releaseforumDao.addReleaseforum(releaseforum);
    }

    @Override
    public void updateReleaseforum(Releaseforum releaseforum) {
        releaseforumDao.updateReleaseforum(releaseforum);
    }

    @Override
    public void deleteReleaseforum(String rno) {
        releaseforumDao.deleteReleaseforum(rno);
    }
}
