package com.cric.apis.controller;

import com.cric.apis.entities.Match;
import com.cric.apis.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
    @Autowired
    private MatchService matchService;

    //get live matches
@GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
}

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
    return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
         }

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(matchService.getPointTable(),HttpStatus.OK);
    }
}
