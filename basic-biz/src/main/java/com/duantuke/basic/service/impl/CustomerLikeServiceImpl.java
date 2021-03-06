package com.duantuke.basic.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duantuke.basic.enums.BusinessTypeEnum;
import com.duantuke.basic.enums.IsvisibleEnum;
import com.duantuke.basic.face.bean.PageItem;
import com.duantuke.basic.face.service.CustomerLikeService;
import com.duantuke.basic.mappers.CustomerLikeHotelMapper;
import com.duantuke.basic.mappers.CustomerLikeJourneyMapper;
import com.duantuke.basic.mappers.CustomerLikeSightMapper;
import com.duantuke.basic.po.CustomerLikeHotelExample;
import com.duantuke.basic.po.CustomerLikeJourneyExample;
import com.duantuke.basic.po.CustomerLikeSightExample;
import com.duantuke.basic.po.Hotel;
import com.duantuke.basic.po.Journey;
import com.duantuke.basic.po.Sight;

/**
 * @author tankai
 * 收藏相关接口
 */
@Service
public class CustomerLikeServiceImpl implements CustomerLikeService {
	
	private static Logger logger = LoggerFactory.getLogger(CustomerLikeServiceImpl.class);
	
	@Autowired
	private CustomerLikeSightMapper customerLikeSightMapper;

	@Autowired
	private CustomerLikeHotelMapper customerLikeHotelMapper;
	@Autowired
	private CustomerLikeJourneyMapper customerLikeJourneyMapper;
	
	/**
	 * 根据用户id查询收藏的景点列表
	 */
	@Override
	public List<Sight> querySights(Long customerId,PageItem pageItem) {
		logger.info("查询用户customer：{}的收藏景点",customerId);
		CustomerLikeSightExample example = new CustomerLikeSightExample();
		CustomerLikeSightExample.Criteria criteria = example.createCriteria();
		if(pageItem==null){
			pageItem = new PageItem();
		}
		example.setLimitStart(pageItem.getBegin());
		example.setLimitEnd(pageItem.getEnd());
//		criteria.andIsvisibleEqualTo(IsvisibleEnum.yes.getCode());
		criteria.andCustomerIdEqualTo(customerId);
		criteria.andBusinessTypeEqualTo(Short.valueOf(BusinessTypeEnum.sight.getCode()+""));
		
		return customerLikeSightMapper.selectByExample(example);
	}
	

	
	/**
	 * 根据用户id查询收藏的酒店列表
	 */
	@Override
	public List<Hotel> queryHotels(Long customerId,PageItem pageItem) {
		logger.info("查询用户customer：{}的收藏酒店",customerId);
		CustomerLikeHotelExample example = new CustomerLikeHotelExample();
		CustomerLikeHotelExample.Criteria criteria = example.createCriteria();
		if(pageItem==null){
			pageItem = new PageItem();
		}
		example.setLimitStart(pageItem.getBegin());
		example.setLimitEnd(pageItem.getEnd());
		criteria.andIsvisibleEqualTo(IsvisibleEnum.yes.getCode());
		criteria.andCustomerIdEqualTo(customerId);
		criteria.andBusinessTypeEqualTo(Short.valueOf(BusinessTypeEnum.hotel.getCode()+""));
		
		return customerLikeHotelMapper.selectByExample(example);
	}



	@Override
	public List<Journey> queryJourneys(Long customerId,PageItem pageItem) {

		logger.info("查询用户customer：{}的收藏酒店",customerId);
		CustomerLikeJourneyExample example = new CustomerLikeJourneyExample();
		CustomerLikeJourneyExample.Criteria criteria = example.createCriteria();
		if(pageItem==null){
			pageItem = new PageItem();
		}
		example.setLimitStart(pageItem.getBegin());
		example.setLimitEnd(pageItem.getEnd());
//		criteria.andIsvisibleEqualTo(IsvisibleEnum.yes.getCode());
		criteria.andCustomerIdEqualTo(customerId);
		criteria.andBusinessTypeEqualTo(Short.valueOf(BusinessTypeEnum.journey.getCode()+""));
		return customerLikeJourneyMapper.selectByExample(example);
	
	}


}
