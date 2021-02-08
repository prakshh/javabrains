package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//public class TopicRepository {
	//getAllTopics
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)

// spring data jpa provides class "CrudRepository", 
// so you can use interface to implement that

public interface TopicRepository extends CrudRepository<Topic, String>{

}
