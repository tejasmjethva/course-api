package com.springboot.starter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@Autowired
	private TopicService topicService;

	//GET method
	//@RequestMapping("/topics")
	//OR
	@GetMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}

	//GET method
	//@RequestMapping("/topics/{id}")
	//OR
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}

	//POST method
	//@RequestBody converts jason representation to Topic object
	//@RequestMapping(method = RequestMethod.POST, value = "/topics")
	//OR
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}

	//PUT method
	//@RequestBody converts jason representation to Topic object
	//@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	//OR
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
		topicService.updateTopic(topic);
	}

	//DELETE method
	//@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	//OR
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
}
