package com.uefa.repository;

import org.springframework.data.repository.CrudRepository;

import com.uefa.vo.MemberVo;

public interface MemberRepository extends CrudRepository<MemberVo, String> {

	Iterable<MemberVo> findAllByOrderByIdAsc();

	MemberVo findByIdAndPw(String id, String pw);
}
