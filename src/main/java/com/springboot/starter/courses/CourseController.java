package com.springboot.starter.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.starter.topic.Topic;

@RestController
public class CourseController 
{
	@Autowired
	private CourseService courseService;

	//GET method
	//@RequestMapping("/courses")
	//OR
	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id)
	{
		return courseService.getAllCourses(id);
	}

	//GET method
	//@RequestMapping("/courses/{id}")
	//OR
	@GetMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id)
	{
		return courseService.getCourse(id);
	}

	//POST method
	//@RequestBody converts jason representation to Topic object
	//@RequestMapping(method = RequestMethod.POST, value = "/courses")
	//OR
	@PostMapping("/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId, "", ""));
		
		courseService.addCourse(course);
	}

	//PUT method
	//@RequestBody converts jason representation to Topic object
	//@RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
	//OR
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id)
	{
		course.setTopic(new Topic(topicId, "", ""));
		
		courseService.updateCourse(course);
	}

	//DELETE method
	//@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
	//OR
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable String id)
	{
		courseService.deleteTopic(id);
	}
}
