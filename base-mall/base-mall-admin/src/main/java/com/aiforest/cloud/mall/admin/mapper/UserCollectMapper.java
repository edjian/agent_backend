/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.mall.admin.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aiforest.cloud.mall.common.entity.UserCollect;
import org.apache.ibatis.annotations.Param;

/**
 * 用户收藏
 *
 * @author JL
 * @date 2019-09-22 20:45:45
 */
public interface UserCollectMapper extends BaseMapper<UserCollect> {

	IPage<UserCollect> selectPage2(IPage<UserCollect> page,  @Param("query") UserCollect userCollect);

	String selectCollectId(@Param("query") UserCollect userCollect);
}
