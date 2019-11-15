package com.springboot.starter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
	/**private List<Course> courses = new ArrayList<>(Arrays.asList(
			new Course("spring", "Spring Framework", "Spring Framework Description"),
			new Course("java", "Core Java Framework", "Core Java Description"),
			new Course("javascript", "JavaScript", "Java Script Description"))); */
	
	public List<Course> getAllCourses(String topicId)
	{
		//return courses;
		List<Course> courseList = new ArrayList<>();
		
		courseRepository.findByTopicId(topicId).forEach(course -> courseList.add(course));
		
		return courseList;
	}
	
	public Course getCourse(String id)
	{
		//return courses.stream().filter(c -> c.getId().equals(id)).findFirst().get();
		
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course)
	{
		//topics.add(topic);
		
		courseRepository.save(course);
	}

	public void updateCourse(Course course) 
	{
		/**for(int i = 0; i < courses.size(); i++)
		{
			Course c = courses.get(i);
			
			if(c.getId().equals(course.getId()))
			{
				courses.set(i, topic);
				
				return;
			}
		}*/
		
		courseRepository.save(course);
	}

	public void deleteTopic(String id) 
	{
		//courses.removeIf(c -> c.getId().equals(id));
		
		courseRepository.deleteById(id);
	}
}
