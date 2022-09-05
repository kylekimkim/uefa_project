package com.uefa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.uefa.vo.MemberVo;


public interface MemberRepository extends CrudRepository<MemberVo, String> {

	public Page<MemberVo> findAll(Pageable pageable);
	
	Iterable<MemberVo> findAllByOrderByIdAsc();

	MemberVo findByIdAndPw(String id, String pw);
	
	@Query("SELECT mem from MemberVo mem where mem.id=?1")
	public Iterable<MemberVo> modifyMember(@Param("id") String id);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM MemberVo mem where mem.id=?1")
	void deleteMember(@Param("id") String id);

}
