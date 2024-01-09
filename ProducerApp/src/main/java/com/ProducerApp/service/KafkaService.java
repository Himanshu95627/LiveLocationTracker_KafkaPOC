package com.ProducerApp.service;

import com.ProducerApp.Config.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public boolean updateLocation(String location){
        log.info("Getting location to produce "+ location);
        this.kafkaTemplate.send(Constants.LOCATION_UPDATE_TOPIC,location);
        return true;
    }
}
