package mirna.com.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mirna.com.springbootkafka.kafka.KafkaProducerService;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {

	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody String message) {
		kafkaProducerService.sendMessage(message);
		
		return ResponseEntity.ok("Message sent to the topic");
	}
}
