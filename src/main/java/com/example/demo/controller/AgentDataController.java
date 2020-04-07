package com.example.demo.controller;

import com.example.demo.model.AgentData;
import com.example.demo.repository.AgentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class AgentDataController {

    @Autowired
    private AgentDataRepository agentDataRepository;

    @RequestMapping("/agentdata")
    public List<AgentData> listAll() {
        return agentDataRepository.findAll();
    }

    @RequestMapping("/agentdata/jpa/{name}")
    public List<AgentData> findByAgentName(@PathVariable String name) {
        return agentDataRepository.findByAgentName(name);
    }

    @RequestMapping("/agentdata/query/{name}")
    public List<AgentData> findAgentByName(@PathVariable String name) {
        return agentDataRepository.findAgentByName(name);
    }
}
