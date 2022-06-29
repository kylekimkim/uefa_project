package com.uefa.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class LeagueVo {
	@Id
	@Column(name="league_num")
	private Integer leagueNum;
	@Column(name="league_name")
	private String leagueName;
	@Column(name="league_logo;")
	private String leagueLogo;
	public Integer getLeagueNum() {
		return leagueNum;
	}
	public void setLeagueNum(Integer leagueNum) {
		this.leagueNum = leagueNum;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getLeagueLogo() {
		return leagueLogo;
	}
	public void setLeagueLogo(String leagueLogo) {
		this.leagueLogo = leagueLogo;
	}
	@Override
	public String toString() {
		return "LeagueVo [leagueNum=" + leagueNum + ", leagueName=" + leagueName + ", leagueLogo=" + leagueLogo + "]";
	}
	
	
	
}
