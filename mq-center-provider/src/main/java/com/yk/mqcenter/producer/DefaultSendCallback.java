package com.yk.mqcenter.producer;

import com.aliyun.openservices.ons.api.OnExceptionContext;
import com.aliyun.openservices.ons.api.SendCallback;
import com.aliyun.openservices.ons.api.SendResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultSendCallback implements SendCallback {

    /**
     * 发送成功回调的方法
     *
     * @param sendResult 发送结果
     */
    @Override
    public void onSuccess(SendResult sendResult) {
        log.info("发送消息成功. sendResult={}", sendResult);
    }

    /**
     * 发送失败回调方法
     *
     * @param context 失败上下文
     */
    @Override
    public void onException(OnExceptionContext context) {
        log.error("发送消息失败. context={}", context);
    }
}
