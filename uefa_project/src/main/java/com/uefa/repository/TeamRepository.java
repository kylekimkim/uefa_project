package com.uefa.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.uefa.vo.TeamVo;


public interface TeamRepository extends CrudRepository<TeamVo, Integer>{
	
	public Page<TeamVo> findAll(Pageable pageable);
	

	@Query("SELECT team from TeamVo team where team.leagueNum=?1 order by (win*3+tie) desc,diffscore desc")
	public Iterable<TeamVo> rankByOrderByVictoryPointsDesc(Integer leagueNum);
	
	
	@Query("SELECT team from TeamVo team where team.teamNum=?1")
	public Iterable<TeamVo> modifyTeam(@Param("teamNum") int teamNum);
	
	@Query("SELECT team.logoImage from TeamVo team where team.teamNum=?1")
	public String myteamLogo(@Param("teamNum") int teamNum);
	
	
	
}
