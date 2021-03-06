package com.duantuke.basic.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duantuke.basic.enums.MessageReadStatusEnum;
import com.duantuke.basic.enums.UserTypeEnum;
import com.duantuke.basic.exception.OpenException;
import com.duantuke.basic.face.service.PushLogService;
import com.duantuke.basic.mappers.LPushLogMapper;
import com.duantuke.basic.po.LPushLog;
import com.duantuke.basic.po.LPushLogExample;

/**
 * app消息接口
 * @author tankai
 */
@Service
public class PushLogServiceImpl implements PushLogService {
	
	private static Logger logger = LoggerFactory.getLogger(PushLogServiceImpl.class);
	
	@Autowired
	private LPushLogMapper lPushLogMapper;

	@Override
	@Deprecated
	public List<LPushLog> queryPushLogByMid(Long mid) {

		LPushLogExample example = new LPushLogExample();
		LPushLogExample.Criteria hoCriteria = example.createCriteria();
		hoCriteria.andMidEqualTo(mid);
		example.setOrderByClause("time desc");
		List<LPushLog> models =  lPushLogMapper.selectByExample(example);
		return models;
	
	}

	@Override
	public int updateReadStatus(Long customerId,Long id) {

		LPushLogExample example = new LPushLogExample();
		LPushLogExample.Criteria hoCriteria = example.createCriteria();
		hoCriteria.andMidEqualTo(customerId);
		hoCriteria.andIdEqualTo(id);
		
		LPushLog record = new LPushLog();
		record.setReadstatus(MessageReadStatusEnum.read.getCode());
		return lPushLogMapper.updateByExampleSelective(record,example);
	}

	@Override
	public List<LPushLog> queryPushLogByMid(LPushLog lPushLog) {

		if(lPushLog==null){
			throw new OpenException("参数为空");
		}
		
		if(lPushLog.getMid()==null){
			throw new OpenException("用户id为空");
		}

		LPushLogExample example = new LPushLogExample();
		LPushLogExample.Criteria hoCriteria = example.createCriteria();
		hoCriteria.andMidEqualTo(lPushLog.getMid());
		hoCriteria.andUserTypeEqualTo(lPushLog.getUserType()==null?UserTypeEnum.customer.getCode():lPushLog.getUserType());//默认b端用户
		example.setLimitStart(lPushLog.getBegin());
		example.setLimitEnd(lPushLog.getEnd());
		example.setOrderByClause("time desc");
		List<LPushLog> models =  lPushLogMapper.selectByExample(example);
		return models;
	
	
	}


}
