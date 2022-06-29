package com.uefa.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "team")
public class TeamVo {
	@Id
	@Column(name="team_num")
	private Integer teamNum;
	@Column(name="team_name")
	private String teamName;
	@Column(name="league_num")
	private Integer leagueNum;
	@Column(name="logo_image")
	private String logoImage;
	@Column(name="match_count")
	private Integer matchCount;
	private Integer win;
	private Integer tie;
	private Integer defeat;
	@Column(name="victory_points")
	private Integer victoryPoints;
	
	public Integer getTeamNum() {
		return teamNum;
	}
	public void setTeamNum(Integer teamNum) {
		this.teamNum = teamNum;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getLeagueNum() {
		return leagueNum;
	}
	public void setLeagueNum(Integer leagueNum) {
		this.leagueNum = leagueNum;
	}
	public String getLogoImage() {
		return logoImage;
	}
	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}
	public Integer getMatchCount() {
		return matchCount;
	}
	public void setMatchCount(Integer matchCount) {
		this.matchCount = matchCount;
	}
	public Integer getWin() {
		return win;
	}
	public void setWin(Integer win) {
		this.win = win;
	}
	public Integer getTie() {
		return tie;
	}
	public void setTie(Integer tie) {
		this.tie = tie;
	}
	public Integer getDefeat() {
		return defeat;
	}
	public void setDefeat(Integer defeat) {
		this.defeat = defeat;
	}
	public Integer getVictoryPoints() {
		return victoryPoints;
	}
	public void setVictoryPoints(Integer victoryPoints) {
		this.victoryPoints = victoryPoints;
	}
	@Override
	public String toString() {
		return "TeamVo [teamNum=" + teamNum + ", teamName=" + teamName + ", leagueNum=" + leagueNum + ", logoImage="
				+ logoImage + ", matchCount=" + matchCount + ", win=" + win + ", tie=" + tie + ", defeat=" + defeat
				+ ", victoryPoints=" + victoryPoints + "]";
	}
	
	
}
