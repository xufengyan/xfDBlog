package com.xf.blog.business.service;


import com.github.pagehelper.PageInfo;
import com.xf.blog.framework.object.AbstractService;
import com.xf.blog.business.entity.User;
import com.xf.blog.business.entity.UserPwd;
import com.xf.blog.business.vo.UserConditionVO;
import com.xf.blog.framework.object.AbstractService;
import me.zhyd.oauth.model.AuthSource;

import java.util.List;

/**
 * 用户
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface SysUserService extends AbstractService<User, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<User> findPageBreakByCondition(UserConditionVO vo);

    /**
     * 更新用户最后一次登录的状态信息
     *
     * @param user
     * @return
     */
    User updateUserLastLoginInfo(User user);

    /**
     * 根据用户名查找
     *
     * @param userName
     * @return
     */
    User getByUserName(String userName);

    /**
     * 通过角色Id获取用户列表
     *
     * @param roleId
     * @return
     */
    List<User> listByRoleId(Long roleId);

    /**
     * 修改密码
     *
     * @param userPwd
     * @return
     */
    boolean updatePwd(UserPwd userPwd) throws Exception;


    /**
     * 通过用户的uuid和source查询用户是否存在
     *
     * @param uuid
     * @param source
     * @return
     */
    User getByUuidAndSource(String uuid, String source);
}
