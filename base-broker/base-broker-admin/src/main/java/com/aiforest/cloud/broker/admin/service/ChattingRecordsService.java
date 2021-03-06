/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.broker.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aiforest.cloud.broker.common.entity.ChattingRecords;

import java.util.List;

/**
 * 聊天记录
 *
 * @author aiforest
 * @date 2020-10-07 10:46:02
 */
public interface ChattingRecordsService extends IService<ChattingRecords> {

	void updateRe(List<ChattingRecords> chattingRecordsList);

	IPage<ChattingRecords> page1(IPage<ChattingRecords> page, ChattingRecords chattingRecords);

}
