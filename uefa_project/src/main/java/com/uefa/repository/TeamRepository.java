package com.uefa.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


import com.uefa.vo.TeamVo;


public interface TeamRepository extends CrudRepository<TeamVo, Integer>{
	
	public Page<TeamVo> findAll(Pageable pageable);

}