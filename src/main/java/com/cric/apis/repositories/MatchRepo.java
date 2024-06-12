package com.cric.apis.repositories;

import com.cric.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {

    //fetch karna hai match
    //so provide teamHeading

    Optional<Match> findByMatchHeading(String matchHeading);

}
