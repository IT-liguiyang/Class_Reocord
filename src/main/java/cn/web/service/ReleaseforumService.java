package cn.web.service;

import cn.web.domain.Releaseforum;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ReleaseforumService {



    public PageInfo<Releaseforum> findAll(Releaseforum releaseforum, Integer pageNum, Integer pageSize);

    /**
     * 检查主键是否存在
     * @param key
     * @return
     */
    public List<Releaseforum> queryReleaseforumByPrimaryKey(String key);



    /**
     * 增加
     * @param  releaseforum
     */
    public void addReleaseforum(Releaseforum releaseforum);

    /**
     * 更新
     * @param  releaseforum
     */
    public void updateReleaseforum(Releaseforum releaseforum);

    /**
     * 删除
     * @param rno
     */
    public void deleteReleaseforum(String rno);
}
