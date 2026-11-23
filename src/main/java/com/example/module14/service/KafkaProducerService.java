
package com.example.module14.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "module14-demo";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(
            KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {

        kafkaTemplate.send(TOPIC, message)
                .whenComplete((result, exception) -> {

                    if (exception == null) {
                        System.out.println(
                                "Message sent successfully: " + message
                        );
                    } else {
                        System.err.println(
                                "Failed to send message: "
                                        + exception.getMessage()
                        );
                    }
                });
    }
}
