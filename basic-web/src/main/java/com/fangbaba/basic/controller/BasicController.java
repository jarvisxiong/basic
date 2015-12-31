package com.fangbaba.basic.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fangbaba.basic.face.bean.CityModel;
import com.fangbaba.basic.face.bean.DistrictModel;
import com.fangbaba.basic.face.bean.HotelModel;
import com.fangbaba.basic.face.bean.ProvinceModel;
import com.fangbaba.basic.face.bean.RoomModel;
import com.fangbaba.basic.face.bean.RoomtypeModel;
import com.fangbaba.basic.face.bean.jsonbean.PmsRoomJsonBean;
import com.fangbaba.basic.face.bean.jsonbean.PmsRoomtypeJsonBean;
import com.fangbaba.basic.face.bean.vo.HotelVo;
import com.fangbaba.basic.face.service.CityService;
import com.fangbaba.basic.face.service.DistrictService;
import com.fangbaba.basic.face.service.ProvinceService;
import com.fangbaba.basic.service.HotelService;
import com.fangbaba.basic.service.RoomService;
import com.fangbaba.basic.service.RoomtypeService;

@Controller
@RequestMapping(value = "/basic")
public class BasicController {

	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private RoomtypeService roomtypeService;
	
	@Autowired
	private DistrictService districtService;
	
	@Autowired
	private ProvinceService provinceService;
	

	@RequestMapping(value = "/synchotel", method = RequestMethod.POST)
	public ResponseEntity<String> searchES(String json) {
		hotelService.syncHotelInfo(json);
		return new ResponseEntity<String>("ok", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/queryallhotels", method = RequestMethod.POST)
	public ResponseEntity<List<HotelModel>> queryAllHotels(){
		return new ResponseEntity<List<HotelModel>>(hotelService.queryAllHotels(), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/querybyid", method = RequestMethod.POST)
	public ResponseEntity<HotelModel>  queryById(Long id){
		return new ResponseEntity<HotelModel>(hotelService.queryById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/queryhotelbypms", method = RequestMethod.POST)
	public ResponseEntity<HotelModel>  queryHotelByPms(String pms){
		return new ResponseEntity<HotelModel>(hotelService.queryByPms(pms), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/querydetail", method = RequestMethod.POST)
	public ResponseEntity<HotelVo>  queryDetail(Long id,String begintime,String endtime){
		return new ResponseEntity<HotelVo>(hotelService.queryDetail(id, begintime, endtime), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/queryallcitys", method = RequestMethod.POST)
	public ResponseEntity<List<CityModel>>  queryAllCitys(){
		return new ResponseEntity<List<CityModel>>(cityService.queryAllCitys(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/queryalldistricts", method = RequestMethod.POST)
	public ResponseEntity<List<DistrictModel>>  queryAllDistricts(){
		return new ResponseEntity<List<DistrictModel>>(districtService.queryAllDistricts(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/queryallprovinces", method = RequestMethod.POST)
	public ResponseEntity<List<ProvinceModel>>  queryAllProvinces(){
		return new ResponseEntity<List<ProvinceModel>>(provinceService.queryAllProvinces(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/querybyroomtypeid", method = RequestMethod.POST)
	public ResponseEntity<List<RoomModel>>  queryByRoomTypeId(Long roomtypeid){
		return new ResponseEntity<List<RoomModel>>(roomService.queryByRoomTypeId(roomtypeid), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/queryroombypms", method = RequestMethod.POST)
	public ResponseEntity<RoomModel>  queryRoomByPms(String pms){
		return new ResponseEntity<RoomModel>(roomService.queryByPms(pms), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/queryroombyid", method = RequestMethod.POST)
	public ResponseEntity<RoomModel>  queryRoomById(Long id){
		return new ResponseEntity<RoomModel>(roomService.queryById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/syncroominfo", method = RequestMethod.POST)
	public ResponseEntity<String>  syncRoomInfo(Long roomtypeid,List<PmsRoomJsonBean> rooms){
		roomService.syncRoomInfo(roomtypeid,rooms);
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delroombyroomtypeid", method = RequestMethod.POST)
	public ResponseEntity<String>  delRoomByRoomtypeid(Long roomtypeid){
		roomService.delRoomByRoomtypeid(roomtypeid);
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/querypricebyroomtypeid", method = RequestMethod.POST)
	public ResponseEntity<BigDecimal>  queryPriceByRoomTypeId(Long id){
		return new ResponseEntity<BigDecimal>(roomtypeService.queryPriceByRoomTypeId(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/querybyhotelid", method = RequestMethod.POST)
	public ResponseEntity<List<RoomtypeModel>>  queryByHotelId(Long id){
		return new ResponseEntity<List<RoomtypeModel>>(roomtypeService.queryByHotelId(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/querybypms", method = RequestMethod.POST)
	public ResponseEntity<RoomtypeModel>  queryByPms(String pms){
		return new ResponseEntity<RoomtypeModel>(roomtypeService.queryByPms(pms), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/queryroomtypebyid", method = RequestMethod.POST)
	public ResponseEntity<RoomtypeModel>  queryRoomTypeById(Long id){
		return new ResponseEntity<RoomtypeModel>(roomtypeService.queryById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/syncroomtypeinfo", method = RequestMethod.POST)
	public ResponseEntity<String>  syncRoomtypeInfo(Long hotelid,List<PmsRoomtypeJsonBean> roomtypes){
		roomtypeService.syncRoomtypeInfo(hotelid,roomtypes);
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
}