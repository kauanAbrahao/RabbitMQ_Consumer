package mq.consumer.consumer;

import dto.CreateDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CreateDepartmentConsumer {
    @RabbitListener(queues = "createDepartmentQueue")
    public void consume(CreateDTO dto){
        log.info(String.format("CreateDTO received - creating department: %s", dto.getDepartment().getNameDpt()));
    }
}
