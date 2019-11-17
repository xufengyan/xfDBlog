package com.xf.blog.persistence.mapper;

import com.xf.blog.business.vo.NoticeConditionVO;
import com.xf.blog.persistence.beans.SysNotice;
import com.xf.blog.plugin.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface SysNoticeMapper extends BaseMapper<SysNotice>{

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<SysNotice> findPageBreakByCondition(NoticeConditionVO vo);
}
