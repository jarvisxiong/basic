package com.fangbaba.basic.face.service;

import java.util.List;

import com.fangbaba.basic.face.bean.RoomModel;
import com.fangbaba.basic.face.bean.RoomtypeModel;
import com.fangbaba.basic.face.bean.jsonbean.PmsRoomJsonBean;

public interface RoomService {
	/**
	 * @param roomtypeid
	 * 根据房型id查询房间列表
	 */
	List<RoomModel> queryByRoomTypeId(Long roomtypeid);
	/**
	 * @param pms
	 * 通过pms号查询
	 */
	RoomModel queryByPms(String pms);
	/**
	 * @param id
	 * 通过id查询
	 */
	RoomModel queryById(Long id);
}