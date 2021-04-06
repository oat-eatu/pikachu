package com.fuckcode.clcrm.core.service.impl;

import com.fuckcode.clcrm.core.entity.MsgRecord;
import com.fuckcode.clcrm.core.mapper.MsgRecordMapper;
import com.fuckcode.clcrm.core.service.MsgRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 所有的消息发送记录（除开短信），由于该表随时有查询的需求，与短信记录不同，所以将除开短信以外的消息放到该表 服务实现类
 * </p>
 *
 * @author dongyang.yu
 * @since 2018-08-17
 */
@Service
public class MsgRecordServiceImpl extends ServiceImpl<MsgRecordMapper, MsgRecord> implements MsgRecordService {

}
