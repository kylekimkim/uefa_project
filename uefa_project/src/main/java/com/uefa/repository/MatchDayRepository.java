package com.uefa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uefa.vo.MatchDayVo;


public interface MatchDayRepository extends CrudRepository<MatchDayVo, Integer>{

	@Query("SELECT matchday from MatchDayVo matchday where matchday.leagueNum=?1 order by matchDate desc")
	public Iterable<MatchDayVo> eplMatchByOrderByMatchDateDesc(Integer leagueNum);
}
