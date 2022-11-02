package nl.jtim.spring.kafka.consumer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@EmbeddedKafka
@SpringJUnitConfig // @SpringJUnitConfig is a composed annotation that combines @ExtendWith(SpringExtension.class) from JUnit Jupiter with @ContextConfiguration from the Spring TestContext Framework.
public class EmbeddedKafkaIntegrationTest {

    @Autowired
    private EmbeddedKafkaBroker embeddedKafkaBroker;

    @Test
    void yourTestHere() throws Exception {
        embeddedKafkaBroker.getBrokersAsString();
        // TODO implement ;)
    }
}

