package com.uefa.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team_2223")
public class Team2223Vo {
	@Id
	@Column(name="team_num")
	private Integer teamNum;
	@Column(name="team_name")
	private String teamName;
	@Column(name="league_num")
	private Integer leagueNum;
	@Column(name="logo_image")
	private String logoImage;
	private Integer win;
	private Integer tie;
	private Integer defeat;
	private Integer diffscore;
	
	
	public Integer getDiffscore() {
		return diffscore;
	}
	public void setDiffscore(Integer diffscore) {
		this.diffscore = diffscore;
	}
	
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
	@Override
	public String toString() {
		return "TeamVo [teamNum=" + teamNum + ", teamName=" + teamName + ", leagueNum=" + leagueNum + ", logoImage="
				+ logoImage + ", win=" + win + ", tie=" + tie + ", defeat=" + defeat + "]";
	}
}
