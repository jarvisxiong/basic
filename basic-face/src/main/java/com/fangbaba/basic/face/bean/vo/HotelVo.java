package com.fangbaba.basic.face.bean.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author he
 * 酒店详细信息返回前端
 */
public class HotelVo implements Serializable{

	private static final long serialVersionUID = -5991033466226074435L;
	
	private Long id;

    private String hotelname;

    private String hotelcontactname;

    private String detailaddr;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Integer roomnum;

    private String isvisible;

    private String isonline;

    private String retentiontime;

    private String defaultleavetime;

    private String hotelphone;

    private Integer hoteltype;

    private Integer discode;

    private String qtphone;

    private Integer citycode;

    private Integer provcode;

    private String introduction;
    
    //新增
    private String provincename;//省
    
    private String cityname;//市
    
    private String districtname;//县
    
    private List<RoomtypeVo> roomtypes;
    
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHotelcontactname() {
		return hotelcontactname;
	}
	public void setHotelcontactname(String hotelcontactname) {
		this.hotelcontactname = hotelcontactname;
	}
	public String getDetailaddr() {
		return detailaddr;
	}
	public void setDetailaddr(String detailaddr) {
		this.detailaddr = detailaddr;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public Integer getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(Integer roomnum) {
		this.roomnum = roomnum;
	}
	public String getIsvisible() {
		return isvisible;
	}
	public void setIsvisible(String isvisible) {
		this.isvisible = isvisible;
	}
	public String getIsonline() {
		return isonline;
	}
	public void setIsonline(String isonline) {
		this.isonline = isonline;
	}
	public String getRetentiontime() {
		return retentiontime;
	}
	public void setRetentiontime(String retentiontime) {
		this.retentiontime = retentiontime;
	}
	public String getDefaultleavetime() {
		return defaultleavetime;
	}
	public void setDefaultleavetime(String defaultleavetime) {
		this.defaultleavetime = defaultleavetime;
	}
	public String getHotelphone() {
		return hotelphone;
	}
	public void setHotelphone(String hotelphone) {
		this.hotelphone = hotelphone;
	}
	public Integer getHoteltype() {
		return hoteltype;
	}
	public void setHoteltype(Integer hoteltype) {
		this.hoteltype = hoteltype;
	}
	public Integer getDiscode() {
		return discode;
	}
	public void setDiscode(Integer discode) {
		this.discode = discode;
	}
	public String getQtphone() {
		return qtphone;
	}
	public void setQtphone(String qtphone) {
		this.qtphone = qtphone;
	}
	public Integer getCitycode() {
		return citycode;
	}
	public void setCitycode(Integer citycode) {
		this.citycode = citycode;
	}
	public Integer getProvcode() {
		return provcode;
	}
	public void setProvcode(Integer provcode) {
		this.provcode = provcode;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getProvincename() {
		return provincename;
	}
	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	public List<RoomtypeVo> getRoomtypes() {
		return roomtypes;
	}
	public void setRoomtypes(List<RoomtypeVo> roomtypes) {
		this.roomtypes = roomtypes;
	}
}