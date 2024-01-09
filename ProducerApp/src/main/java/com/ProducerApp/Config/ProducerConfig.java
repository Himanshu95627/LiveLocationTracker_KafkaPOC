package com.ProducerApp.Config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Slf4j
public class ProducerConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(Constants.LOCATION_UPDATE_TOPIC).build();
    }
}
