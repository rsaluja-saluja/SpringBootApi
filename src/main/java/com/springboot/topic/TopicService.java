package com.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Description"),
			new Topic("Java","Core Java","Java Description"),
			new Topic("Python","Python Programming","Python Description")));
	
	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopicById(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findAny().get();
	}
	
	public List<Topic> createNewTopic(Topic topic) {
		topics.add(topic);
		return topics;
	}

	public List<Topic> updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		return topics;
	}

	public List<Topic> deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t->t.getId().equals(id));
		return topics;
	}
}
	

	