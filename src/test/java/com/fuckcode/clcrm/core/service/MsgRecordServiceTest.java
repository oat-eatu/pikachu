package com.fuckcode.clcrm.core.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.fuckcode.clcrm.core.entity.SmsTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
@RunWith(SpringRunner.class)
public class MsgRecordServiceTest {
    @Autowired
    private SmsTemplateService smsTemplateService;

    @Test
    public void read(){
        System.out.println(smsTemplateService.list(new Wrapper<SmsTemplate>() {
            @Override
            public SmsTemplate getEntity() {
                return null;
            }

            @Override
            public String getSqlSegment() {
                return null;
            }
        }));
    }

}