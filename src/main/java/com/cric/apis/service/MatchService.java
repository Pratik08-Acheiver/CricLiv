package com.cric.apis.service;

import com.cric.apis.entities.Match;

import java.util.List;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();

    //get Live Matches

    List<Match> getLiveMatches();

    //cwc2024 pointtable
    List<List<String>> getPointTable();
}
