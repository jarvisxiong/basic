package com.duantuke.basic.esbean.input;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JourneyInputBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long journeyId;

    private String title;

	private String author;

	private String pics;
	
	private String content;
	private String tag;

    private String createtime;
    
    private Long journeyRankId;//游记评级id
    private Integer rank;//评级
    private Integer follow;//关注数
    private Integer roomnight;//间夜数
    private Integer comment;//评论数
    private Integer travel;//游记数
    private Integer view;//浏览数 
    private Integer journeyLike;//点赞数 
    private Integer share;//分享数 
    private List<Map<String,String>> hotelIds = new ArrayList<Map<String,String>>();//游记关联的农家院id,数组格式
    private List<Map<String,String>> sightIds = new ArrayList<Map<String,String>>();//游记关联的景点id,数组格式
    //打分
    private Integer paidScore=0;
    
	public Integer getPaidScore() {
		return paidScore;
	}
	public void setPaidScore(Integer paidScore) {
		this.paidScore = paidScore;
	}
    public Long getJourneyId() {
		return journeyId;
	}
	public void setJourneyId(Long journeyId) {
		this.journeyId = journeyId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPics() {
		return pics;
	}
	public void setPics(String pics) {
		this.pics = pics;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	public Long getJourneyRankId() {
		return journeyRankId;
	}
	public void setJourneyRankId(Long journeyRankId) {
		this.journeyRankId = journeyRankId;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Integer getFollow() {
		return follow;
	}
	public void setFollow(Integer follow) {
		this.follow = follow;
	}
	public Integer getRoomnight() {
		return roomnight;
	}
	public void setRoomnight(Integer roomnight) {
		this.roomnight = roomnight;
	}
	public Integer getComment() {
		return comment;
	}
	public void setComment(Integer comment) {
		this.comment = comment;
	}
	public Integer getTravel() {
		return travel;
	}
	public void setTravel(Integer travel) {
		this.travel = travel;
	}
	public Integer getView() {
		return view;
	}
	public void setView(Integer view) {
		this.view = view;
	}
	public Integer getJourneyLike() {
		return journeyLike;
	}
	public void setJourneyLike(Integer journeyLike) {
		this.journeyLike = journeyLike;
	}
	public Integer getShare() {
		return share;
	}
	public void setShare(Integer share) {
		this.share = share;
	}
	public List<Map<String, String>> getHotelIds() {
		return hotelIds;
	}
	public void setHotelIds(List<Map<String, String>> hotelIds) {
		this.hotelIds = hotelIds;
	}
	public List<Map<String, String>> getSightIds() {
		return sightIds;
	}
	public void setSightIds(List<Map<String, String>> sightIds) {
		this.sightIds = sightIds;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

}
