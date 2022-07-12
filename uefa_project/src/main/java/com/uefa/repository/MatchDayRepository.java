package com.uefa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uefa.vo.MatchDayVo;


public interface MatchDayRepository extends CrudRepository<MatchDayVo, Integer>{

	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='08' order by matchDate asc")
	public Iterable<MatchDayVo> AugMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='09' order by matchDate asc")
	public Iterable<MatchDayVo> SepMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='10' order by matchDate asc")
	public Iterable<MatchDayVo> OctMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='11' order by matchDate asc")
	public Iterable<MatchDayVo> NovMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='12' order by matchDate asc")
	public Iterable<MatchDayVo> DecMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='01' order by matchDate asc")
	public Iterable<MatchDayVo> JanMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='02' order by matchDate asc")
	public Iterable<MatchDayVo> FebMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='03' order by matchDate asc")
	public Iterable<MatchDayVo> MarMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='04' order by matchDate asc")
	public Iterable<MatchDayVo> ApiMatchByOrderByMatchDateDesc(Integer leagueNum);
	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 and month(matchDate)='05' order by matchDate asc")
	public Iterable<MatchDayVo> MayMatchByOrderByMatchDateDesc(Integer leagueNum);
	
}
