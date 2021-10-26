package com.maxqiu.demo.Mode2_WorkQueues.handler;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author Max_Qiu
 */
@Component
@RabbitListener(queues = "work-queues")
public class WorkQueuesReceiver1 {
    @RabbitHandler
    public void receive(Integer msg) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---Received1:" + msg);
    }
}
