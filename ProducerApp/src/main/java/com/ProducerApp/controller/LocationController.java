package com.ProducerApp.controller;

import com.ProducerApp.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    KafkaService kafkaService;

    @PostMapping
    public String updateLocation(){
        double x = Math.random() * 100;
        double y = Math.random() * 100;

        kafkaService.updateLocation("("+x+", "+y+")");
        return "location updated";
    }
}
