package com.fuckcode.clcrm.core.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 所有的消息发送记录（除开短信），由于该表随时有查询的需求，与短信记录不同，所以将除开短信以外的消息放到该表 前端控制器
 * </p>
 *
 * @author dongyang.yu
 * @since 2018-08-17
 */
@Controller
@RequestMapping("/msgRecord")
public class MsgRecordController {

}

