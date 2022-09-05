package com.uefa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.uefa.vo.MatchDay2223Vo;
import com.uefa.vo.MatchDayVo;


public interface MatchDay2223Repository extends CrudRepository<MatchDay2223Vo, Integer>{

	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='08' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> AugMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='09' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> SepMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='10' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> OctMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='11' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> NovMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='12' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> DecMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='01' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> JanMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='02' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> FebMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='03' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> MarMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='04' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> ApiMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDay2223Vo matchday where matchday.leagueNum=?1 and month(matchDate)='05' order by matchDate asc, matchTime asc")
	public Iterable<MatchDay2223Vo> MayMatch2223ByOrderByMatchDateDesc(Integer leagueNum);
	
	
	@Query("SELECT match from MatchDay2223Vo match where match.matchNum=?1")
	public Iterable<MatchDay2223Vo> modifyMatch2223(@Param("matchNum") int matchNum);
	
	@Query(nativeQuery=true,value="SELECT * from MatchDay_2223 m where (m.home_num=?1 or m.away_num=?1) and match_date>now() order by match_date asc limit 3")
	public Iterable<MatchDay2223Vo> nextMatch(@Param("teamNum") int teamNum);
	
	@Query(nativeQuery=true,value="SELECT * from MatchDay_2223 m where (m.home_num=?1 or m.away_num=?1) and match_date<now() order by match_date asc limit 3")
	public Iterable<MatchDay2223Vo> preMatch(@Param("teamNum") int teamNum);
}
	

