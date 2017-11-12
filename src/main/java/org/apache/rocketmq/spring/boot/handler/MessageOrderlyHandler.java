package org.apache.rocketmq.spring.boot.handler;

import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.common.message.MessageExt;

/**
 */
public interface MessageOrderlyHandler {
	
    /**
     * @description	： 处理消息的接口
     * @param msgExt 消息对象
     * @param context 上下文
     * @return 是否处理完成
     * @throws Exception 处理异常
     */
    public boolean handleMessage(MessageExt msgExt, ConsumeOrderlyContext context) throws Exception;
    
}