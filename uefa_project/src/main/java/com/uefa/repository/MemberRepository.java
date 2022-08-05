package com.uefa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.uefa.vo.MemberVo;
import com.uefa.vo.TeamVo;

public interface MemberRepository extends CrudRepository<MemberVo, String> {

	Iterable<MemberVo> findAllByOrderByIdAsc();

	MemberVo findByIdAndPw(String id, String pw);
	
	@Query("SELECT mem from MemberVo mem where mem.id=?1")
	public Iterable<MemberVo> modifyMember(@Param("id") String id);
}
