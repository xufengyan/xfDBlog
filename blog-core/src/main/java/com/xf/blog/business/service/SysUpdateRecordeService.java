package com.xf.blog.business.service;


import com.xf.blog.framework.object.AbstractService;
import com.xf.blog.framework.object.AbstractService;
import com.xf.blog.business.entity.UpdateRecorde;
import com.xf.blog.business.vo.UpdateRecordeConditionVO;
import com.github.pagehelper.PageInfo;

/**
 * 更新记录
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface SysUpdateRecordeService extends AbstractService<UpdateRecorde, Long> {

    PageInfo<UpdateRecorde> findPageBreakByCondition(UpdateRecordeConditionVO vo);
}
