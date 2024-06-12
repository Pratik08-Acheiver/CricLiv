package com.cric.apis.entities;

import jakarta.persistence.*;
import org.springframework.beans.factory.config.YamlProcessor;

import java.util.Date;

@Entity
@Table(name = "cric_matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String matchHeading;

    private String matchNumerVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date= new Date();

    public Match() {
    }

    public Match(int matchId, String matchHeading, String matchNumerVenue, String battingTeam, String battingTeamScore, String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete, MatchStatus status, Date date) {
        this.matchId = matchId;
        this.matchHeading = matchHeading;
        this.matchNumerVenue = matchNumerVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getMatchHeading() {
        return matchHeading;
    }

    public void setMatchHeading(String matchHeading) {
        this.matchHeading = matchHeading;
    }

    public String getMatchNumerVenue() {
        return matchNumerVenue;
    }

    public void setMatchNumerVenue(String matchNumerVenue) {
        this.matchNumerVenue = matchNumerVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStatus getMatchStatus() {
        return status;
    }

    public void setMatchStatus() {
        if(textComplete.isEmpty()){
        this.status = MatchStatus.LIVE;
        }
        else{
            this.status = MatchStatus.COMPLETED;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", matchHeading='" + matchHeading + '\'' +
                ", matchNumerVenue='" + matchNumerVenue + '\'' +
                ", battingTeam='" + battingTeam + '\'' +
                ", battingTeamScore='" + battingTeamScore + '\'' +
                ", bowlTeam='" + bowlTeam + '\'' +
                ", bowlTeamScore='" + bowlTeamScore + '\'' +
                ", liveText='" + liveText + '\'' +
                ", matchLink='" + matchLink + '\'' +
                ", textComplete='" + textComplete + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
