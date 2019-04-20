package ru.brazhnikov.rover.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@Configuration
@Slf4j
public class RoverConfiguration {

    @Bean
    public CommandLineRunner getLoadService() {
        return args -> {
            log.info("Start load data");
            log.info("Data = {}");
            log.info("Data = {}");
            log.info("Data = {}");
            log.info("Data has loaded");
        };
    }
}
