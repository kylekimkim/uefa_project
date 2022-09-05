package com.uefa.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "news")
public class NewsVo {
	@Id
	private Integer news_num;
	private String title;
	@Column(name="main_img")
	private String mainImg;
	private String context;
	private String reporter;
	private String source;
	@Column(name="original_link")
	private String originalLink;
	@Column(name="post_time",nullable = true, insertable = false, updatable = false)
	private Date postTime;
	@Column(name="relevant_team")
	private Integer relevantTeam;
	private Integer view;
	
	public Integer getView() {
		return view;
	}
	public void setView(Integer view) {
		this.view = view;
	}
	public Integer getNews_num() {
		return news_num;
	}
	public void setNews_num(Integer news_num) {
		this.news_num = news_num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMainImg() {
		return mainImg;
	}
	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getOriginalLink() {
		return originalLink;
	}
	public void setOriginalLink(String originalLink) {
		this.originalLink = originalLink;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	
	public Integer getRelevantTeam() {
		return relevantTeam;
	}
	public void setRelevantTeam(Integer relevantTeam) {
		this.relevantTeam = relevantTeam;
	}


	
	
}
