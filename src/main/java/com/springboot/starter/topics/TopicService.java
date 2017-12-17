package com.springboot.starter.topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {
	
	@Autowired
	
	private TopicRepository topicRepository;
	
	
	
/*	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript Language", "Java Script Description")
			);*/
	
	public List<Topic> getAllTopic() {
		List<Topic> topics = new ArrayList<>();
		
		topicRepository.findAll();
		//.forEach(topics::add);
		return topics;
	}
	
	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}


	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String Id, Topic topic) {
		topicRepository.save(topic);
/*		for (int i=0; i <=topics.size();i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(Id)) {
				topics.set(i, topic);
				return;
			}
			
		}*/
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
		
	}
	
}
