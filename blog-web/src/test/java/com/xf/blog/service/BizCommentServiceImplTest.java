package com.xf.blog.service;

import com.xf.blog.business.entity.Comment;
import com.xf.blog.business.service.BizCommentService;
import com.xf.blog.BaseJunitTest;
import com.xf.blog.business.entity.Comment;
import com.xf.blog.business.service.BizCommentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @date 2018/4/28 11:14
 * @since 1.0
 */
public class BizCommentServiceImplTest extends BaseJunitTest {

    @Autowired
    private BizCommentService commentService;

    @Test
    public void comment() throws InterruptedException {
        Comment comment = new Comment();
        comment.setPid(1L);
        comment.setNickname("测试");
        comment.setEmail("843977358@qq.com");
        comment.setQq("843977358");
        commentService.comment(comment);

        TimeUnit.SECONDS.sleep(60);
    }
}
