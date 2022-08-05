package com.uefa.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "matchday_2223")
public class MatchDay2223Vo {

	@Id
	@Column(name="match_num")
	private Integer matchNum;
	@Column(name="home_team")
	private String homeTeam;
	@Column(name="home_logo")
	private String homeLogo;
	@Column(name="home_score")
	private Integer homeScore;
	@Column(name="away_team")
	private String awayTeam;
	@Column(name="away_logo")
	private String awayLogo;
	@Column(name="away_score")
	private String awayScore;
	@Column(name="match_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date matchDate;
	@Column(name="match_time")
	private String matchTime;
	@Column(name="league_num")
	private Integer leagueNum;
	private String season;
	@Column(name="home_num")
	private Integer homeNum;
	@Column(name="away_num")
	private Integer awayNum;
	
	public Integer getHomeNum() {
		return homeNum;
	}
	public void setHomeNum(Integer homeNum) {
		this.homeNum = homeNum;
	}
	public Integer getAwayNum() {
		return awayNum;
	}
	public void setAwayNum(Integer awayNum) {
		this.awayNum = awayNum;
	}
	public Integer getMatchNum() {
		return matchNum;
	}
	public void setMatchNum(Integer matchNum) {
		this.matchNum = matchNum;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getHomeLogo() {
		return homeLogo;
	}
	public void setHomeLogo(String homeLogo) {
		this.homeLogo = homeLogo;
	}
	public Integer getHomeScore() {
		return homeScore;
	}
	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	public String getAwayLogo() {
		return awayLogo;
	}
	public void setAwayLogo(String awayLogo) {
		this.awayLogo = awayLogo;
	}
	public String getAwayScore() {
		return awayScore;
	}
	public void setAwayScore(String awayScore) {
		this.awayScore = awayScore;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}
	public Integer getLeagueNum() {
		return leagueNum;
	}
	public void setLeagueNum(Integer leagueNum) {
		this.leagueNum = leagueNum;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	@Override
	public String toString() {
		return "MatchDayVo [matchNum=" + matchNum + ", homeTeam=" + homeTeam + ", homeLogo=" + homeLogo + ", homeScore="
				+ homeScore + ", awayTeam=" + awayTeam + ", awayLogo=" + awayLogo + ", awayScore=" + awayScore
				+ ", matchDate=" + matchDate + ", matchTime=" + matchTime + ", leagueNum=" + leagueNum + ", season="
				+ season + ", homeNum=" + homeNum + ", awayNum=" + awayNum + "]";
	}
}
