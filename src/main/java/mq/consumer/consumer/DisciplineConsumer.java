package mq.consumer.consumer;

import dto.DisciplineDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DisciplineConsumer {

    @RabbitListener(queues = "disciplineQueueWithBean")
    public void consumeWithBean(DisciplineDTO dto){
        log.info(String.format("DTO received with codDtp: %s", dto.getIdDisc()));
    }

}
