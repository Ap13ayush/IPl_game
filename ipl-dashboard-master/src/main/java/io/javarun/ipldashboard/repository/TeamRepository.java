package io.javarun.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.javarun.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
