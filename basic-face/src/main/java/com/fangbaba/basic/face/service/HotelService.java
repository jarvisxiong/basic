package com.fangbaba.basic.face.service;

import java.util.List;

import com.fangbaba.basic.face.bean.HotelModel;
import com.fangbaba.basic.face.bean.vo.HotelVo;

public interface HotelService {
	/**
	 * 查询所有酒店
	 *
	 * @return
	 */
	List<HotelModel> queryAllHotels();

	/**
	 * @param id
	 *            通过id查询
	 */
	HotelModel queryById(Long id);

	/**
	 * @param pms
	 *            通过pms号查询
	 */
	HotelModel queryByPms(String pms);

	/**
	 * 返回酒店详情(包括酒店房型房间房态)
	 */
	HotelVo queryDetail(Long id, String begintime, String endtime);

	/**
	 * 获取酒店最高最低价格
	 *
	 * @param hotelModel
	 * @return
	 */
	HotelModel getPrice(HotelModel hotelModel);

	/**
	 * 同步hms基本酒店信息
	 *
	 * @param hotelModels
	 * @return
	 */
	boolean syncHotelForHMS(List<HotelModel> hotelModels);
}
