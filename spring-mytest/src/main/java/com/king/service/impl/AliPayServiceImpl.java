package com.king.service.impl;

import com.king.service.PayService;
import org.springframework.stereotype.Service;

/**
 * @packageNme com.king.service.impl
 * @Author: jinguoguang
 * @Date: 2024/5/11 9:40
 * @Version: v1.0.0
 **/
@Service("aLiPay")
public class AliPayServiceImpl implements PayService {
    @Override
    public void pay() {
        System.out.println("正在使用支付宝支付");
    }
}
