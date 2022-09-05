package com.uefa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.uefa.vo.NewsVo;




public interface NewsRepository extends CrudRepository<NewsVo, String> {

	public Page<NewsVo> findAll(Pageable pageable);
	
	@Query("SELECT n from NewsVo n where n.news_num=?1")
	public Iterable<NewsVo> modifyNews(@Param("news_num") int news_num);
	
	@Query("SELECT count(news.news_num) from NewsVo news")
	public Integer getNewsCount();
	
	@Query(nativeQuery=true,value="SELECT * from News n order by post_time desc limit 4")
	public Iterable<NewsVo> otherNews();
	
	@Query(nativeQuery=true,value="SELECT * from News n where n.relevant_team=?1 order by post_time desc limit 3")
	public Iterable<NewsVo> relevantNews(@Param("relevantTeam") int teamNum);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM NewsVo n where n.news_num =?1")
	void deleteNews(@Param("news_num") int news_num);
	 
	 @Modifying
	 @Transactional
	 @Query("UPDATE NewsVo n SET n.view=n.view+1 where n.news_num =?1")
	 void updateView(@Param("news_num") int news_num);
}
