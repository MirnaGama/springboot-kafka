package mirna.com.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	private static final Logger _log = LoggerFactory.getLogger(KafkaConsumerService.class);
	
	@KafkaListener(topics = "mytopic", groupId="myGroup")
	public void consume(String message) {
		_log.info(String.format("Message received -> %s", message));
	}
}
