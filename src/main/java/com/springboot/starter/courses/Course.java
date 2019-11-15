package com.springboot.starter.courses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springboot.starter.topic.Topic;

@Entity
public class Course 
{
	@Column
	@Id
	private String id;
	
	@Column
	private String description;
	
	@Column
	private String name;
	
	@ManyToOne
	private Topic topic;
	
	public Course()
	{
		
	}
	
	public Course(String id, String name, String description, String topicId)
	{
		this.id = id;
		
		this.name = name;
		
		this.description = description;
		
		this.topic = new Topic(topicId, "", "");
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Topic getTopic() 
	{
		return topic;
	}

	public void setTopic(Topic topic)
	{
		this.topic = topic;
	}
	
	
}
