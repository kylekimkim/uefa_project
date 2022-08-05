package com.uefa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.uefa.vo.Team2223Vo;




public interface Team2223Repository extends CrudRepository<Team2223Vo, Integer>{
	
	@Query("SELECT team from Team2223Vo team where team.leagueNum=?1 order by (win*3+tie) desc")
	public Iterable<Team2223Vo> rank2223ByOrderByVictoryPointsDesc(Integer leagueNum);

	
	@Query("SELECT team from Team2223Vo team where team.teamNum=?1")
	public Iterable<Team2223Vo> modifyTeam2223(@Param("teamNum") int teamNum);
}
