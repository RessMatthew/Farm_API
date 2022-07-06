package org.csu.api;

import com.google.common.collect.Maps;
import com.yami.shop.bean.enums.SmsType;
import com.yami.shop.service.SmsLogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.google.common.collect.Maps;
import com.yami.shop.bean.app.param.SendSmsParam;
import com.yami.shop.bean.enums.SmsType;
import com.yami.shop.security.api.util.SecurityUtils;
import com.yami.shop.service.SmsLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootTest
public class tests{

    @Autowired
    private SmsLogService smsLogService;

    @Test
    public void sms(){
        smsLogService.sendSms(SmsType.VALID,"111","18390858705",Maps.newHashMap());
    }



}
