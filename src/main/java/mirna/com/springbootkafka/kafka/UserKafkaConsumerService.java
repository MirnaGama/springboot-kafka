package mirna.com.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.kafka.annotation.KafkaListener;

public class UserKafkaConsumerService {

	private static final Logger _log = LoggerFactory.getLogger(UserKafkaConsumerService.class);
	
	@KafkaListener(topics = "newusers", groupId="myGroup")
	public void consume(User user) {
		_log.info(String.format("Json Message received -> %s", user.toString()));
	}
}
