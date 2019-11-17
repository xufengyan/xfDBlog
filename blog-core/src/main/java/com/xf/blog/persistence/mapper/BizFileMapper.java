package com.xf.blog.persistence.mapper;

import com.xf.blog.business.vo.FileConditionVO;
import com.xf.blog.persistence.beans.BizFile;
import com.xf.blog.plugin.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author innodev java team
 * @version 1.0
 * @date 2018/12/14 09:23
 * @since 1.8
 */
@Repository
public interface BizFileMapper extends BaseMapper<BizFile> {

    List<BizFile> findPageBreakByCondition(FileConditionVO vo);
}
