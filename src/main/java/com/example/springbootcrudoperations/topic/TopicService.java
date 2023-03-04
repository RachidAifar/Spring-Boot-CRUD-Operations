package com.example.springbootcrudoperations.topic;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicsData> topics= Arrays.asList(
            new TopicsData("spring","spring framework","spring framework REST Api"),
                new TopicsData("java","spring boot framework","spring boot framework" ),
                new TopicsData("c#","ASP.Net","ASP.Net REST Api")
        );

    public List<TopicsData> getAllTopics(){
        return topics;
    }
    public TopicsData getTopicById(String id){
        return topics.stream().filter(topicsData -> topicsData.getId().equals(id) ).findFirst().get();
    }
}
