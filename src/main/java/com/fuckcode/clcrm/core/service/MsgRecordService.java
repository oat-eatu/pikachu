package com.fuckcode.clcrm.core.service;

import com.fuckcode.clcrm.core.entity.MsgRecord;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 所有的消息发送记录（除开短信），由于该表随时有查询的需求，与短信记录不同，所以将除开短信以外的消息放到该表 服务类
 * </p>
 *
 * @author dongyang.yu
 * @since 2018-08-17
 */
public interface MsgRecordService extends IService<MsgRecord> {

}
