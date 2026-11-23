package com.example.module14.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(
            topics = "module14-demo",
            groupId = "module14-group"
    )
    public void consumeMessage(String message) {

        System.out.println(
                "Message received from Kafka: " + message
        );
    }
}
