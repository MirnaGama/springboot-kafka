package mirna.com.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mirna.com.springbootkafka.kafka.UserKafkaProducerService;
import mirna.com.springbootkafka.model.User;

@RestController
@RequestMapping("api/v1/kafka/user")
public class UserMessageController {

	@Autowired
	private UserKafkaProducerService kafkaProducerService;
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user) {
		kafkaProducerService.sendMessage(user);
		
		return ResponseEntity.ok("User Message sent to the topic");
	}
}
