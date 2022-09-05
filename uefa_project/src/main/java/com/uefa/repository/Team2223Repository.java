package com.uefa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.uefa.vo.Team2223Vo;




public interface Team2223Repository extends CrudRepository<Team2223Vo, Integer>{
	
	@Query("SELECT team from Team2223Vo team where team.leagueNum=?1 order by (win*3+tie) desc,diffscore desc")
	public Iterable<Team2223Vo> rank2223ByOrderByVictoryPointsDesc(Integer leagueNum);

	
	@Query("SELECT team from Team2223Vo team where team.teamNum=?1")
	public Iterable<Team2223Vo> modifyTeam2223(@Param("teamNum") int teamNum);

	
	@Query("SELECT team.leagueNum from Team2223Vo team where team.teamNum=?1")
	public Integer myteamLeagueNum(@Param("teamNum") int teamNum);
	
	@Query(nativeQuery=true,value="SELECT ranked.ranking from (select t.team_num,rank() over(order by win*3+tie desc,diffscore desc) as 'ranking' from team_2223 t where league_num=1)ranked where team_num=?1 ")
	public Integer eplRanking(@Param("teamNum") int teamNum);
	
	@Query(nativeQuery=true,value="SELECT ranked.ranking from (select t.team_num,rank() over(order by win*3+tie desc,diffscore desc) as 'ranking' from team_2223 t where league_num=2)ranked where team_num=?1 ")
	public Integer laligaRanking(@Param("teamNum") int teamNum);
	
	@Query(nativeQuery=true,value="SELECT ranked.ranking from (select t.team_num,rank() over(order by win*3+tie desc,diffscore desc) as 'ranking' from team_2223 t where league_num=3)ranked where team_num=?1 ")
	public Integer bundesRanking(@Param("teamNum") int teamNum);
	
	@Query(nativeQuery=true,value="SELECT ranked.ranking from (select t.team_num,rank() over(order by win*3+tie desc,diffscore desc) as 'ranking' from team_2223 t where league_num=4)ranked where team_num=?1 ")
	public Integer serieRanking(@Param("teamNum") int teamNum);
	
	@Query(nativeQuery=true,value="SELECT ranked.ranking from (select t.team_num,rank() over(order by win*3+tie desc,diffscore desc) as 'ranking' from team_2223 t where league_num=5)ranked where team_num=?1 ")
	public Integer angRanking(@Param("teamNum") int teamNum);
}
