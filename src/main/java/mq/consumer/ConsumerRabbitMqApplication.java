package mq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerRabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRabbitMqApplication.class, args);
    }

}
