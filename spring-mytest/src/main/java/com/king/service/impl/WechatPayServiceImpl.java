package com.king.service.impl;

import com.king.service.PayService;
import org.springframework.stereotype.Service;

/**
 * @packageNme com.king.service.impl
 * @Author: jinguoguang
 * @Date: 2024/5/11 9:38
 * @Version: v1.0.0
 **/
@Service("weChatPay")
public class WechatPayServiceImpl implements PayService {
    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }
}
