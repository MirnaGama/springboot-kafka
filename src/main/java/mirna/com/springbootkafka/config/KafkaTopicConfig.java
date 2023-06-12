package mirna.com.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic buildMyTopic() {
		return TopicBuilder.name("mytopic").build();
	}
	
	@Bean
	public NewTopic buildNewUsersTopic() {
		return TopicBuilder.name("newusers").build();
	}
}
