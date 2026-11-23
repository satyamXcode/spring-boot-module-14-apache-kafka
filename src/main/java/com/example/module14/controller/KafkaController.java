package com.example.module14.controller;

import com.example.module14.service.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(
            KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(
            @RequestParam String message) {

        producerService.sendMessage(message);

        return ResponseEntity.accepted()
                .body("Message accepted for publishing: " + message);
    }
}
