package org.nagappa;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@RefreshScope
@EnableEurekaClient
@SpringBootApplication
public class AnimalApp {
    public static void main(String[] args) {
        SpringApplication.run(AnimalApp.class, args);
    }

    @Bean
    TimedAspect timedAspect(MeterRegistry meterRegistry){
        return new TimedAspect(meterRegistry);
    }
}
