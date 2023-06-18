package mq.consumer.config;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Configuration
@AllArgsConstructor
public class CreateQueues {
    private static final String NAME_EXCHANGE = "amq.direct";
    private AmqpAdmin amqpAdmin;

    @PostConstruct
    private void create(){
        Queue createDepartment = new Queue("createDepartmentQueue");
        Queue createDiscipline = new Queue("createDisciplineQueue");

        Binding bindDep = new Binding(createDepartment.getName(), Binding.DestinationType.QUEUE, "amq.fanout", "", null);
        Binding bindDis = new Binding(createDiscipline.getName(), Binding.DestinationType.QUEUE, "amq.fanout", "", null);

        amqpAdmin.declareQueue(createDepartment);
        amqpAdmin.declareQueue(createDiscipline);
        amqpAdmin.declareBinding(bindDep);
        amqpAdmin.declareBinding(bindDis);

    }
}
