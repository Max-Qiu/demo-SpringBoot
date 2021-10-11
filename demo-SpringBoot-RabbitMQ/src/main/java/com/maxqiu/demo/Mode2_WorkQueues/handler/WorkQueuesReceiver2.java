package com.maxqiu.demo.Mode2_WorkQueues.handler;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 工作队列消费者
 *
 * @author Max_Qiu
 */
@Component
@RabbitListener(queues = "work-queues")
public class WorkQueuesReceiver2 {
    @RabbitHandler
    public void receive(Integer msg) {
        System.out.println("===Received2:" + msg);
    }
}
