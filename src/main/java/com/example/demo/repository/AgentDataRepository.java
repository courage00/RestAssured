package com.example.demo.repository;

import com.example.demo.model.AgentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgentDataRepository extends JpaRepository<AgentData,String> {

    public List<AgentData> findByAgentName(String name);

    @Query("select a from AgentData a where agentName = :name")
    public List<AgentData> findAgentByName(String name);

}
