package com.springboot.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java Framework", "Core Java Description"),
			new Topic("javascript", "JavaScript", "Java Script Description"))); 
	
	public List<Topic> getAllTopics()
	{
		//return topics;
		List<Topic> topicList = new ArrayList<>();
		
		topicRepository.findAll().forEach(topic -> topicList.add(topic));
		
		return topicList;
	}
	
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic)
	{
		//topics.add(topic);
		
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic) 
	{
		/**for(int i = 0; i < topics.size(); i++)
		{
			Topic t = topics.get(i);
			
			if(t.getId().equals(topic.getId()))
			{
				topics.set(i, topic);
				
				return;
			}
		}*/
		
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) 
	{
		//topics.removeIf(t -> t.getId().equals(id));
		
		topicRepository.deleteById(id);
	}
}
