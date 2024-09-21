package com.aruna.consumer;

import com.aruna.model.MessageModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMqConsumer {

    @RabbitListener(queues = "queue.A")
    public void receivedMessage(MessageModel messageModel) {

        log.info("Message successfully received"+ messageModel.toString());

    }
    @RabbitListener(queues = "queue.B")
    public void receivedMessageB(MessageModel messageModel) {

        log.info("Message successfully received ::B {}", messageModel);

    }
}
