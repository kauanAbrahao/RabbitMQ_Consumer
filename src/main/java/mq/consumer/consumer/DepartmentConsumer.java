package mq.consumer.consumer;

import dto.DepartmentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DepartmentConsumer {

    @RabbitListener(queues = "departmentQueue")
    public void consume(DepartmentDTO departmentDTO){
        log.info(String.format("Msg %s received from departmentQueue", departmentDTO.toString()));
    }

    @RabbitListener(queues = "departmentQueueWithBean")
    public void consumeWithBean(String codDpt){
        log.info(String.format("DTO received with codDtp: %s", codDpt));
    }
}
