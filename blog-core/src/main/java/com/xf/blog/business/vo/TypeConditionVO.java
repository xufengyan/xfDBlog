package com.xf.blog.business.vo;

import com.xf.blog.framework.object.BaseConditionVO;
import com.xf.blog.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TypeConditionVO extends BaseConditionVO {
	private Long pid;
	private String name;
	private String description;
	private Integer sort;
	private Boolean available;
	private String icon;
}

