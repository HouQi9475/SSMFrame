package com.leo.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.leo.ssm.mapper.ItemsCustomMapper;
import com.leo.ssm.po.ItemsCustom;
import com.leo.ssm.po.ItemsQueryVo;
import com.leo.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {
	//注入ItemsCustomMapper
	@Autowired
	private ItemsCustomMapper itemsCustomMapper;

	@Override
	public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo) {
		// TODO Auto-generated method stub
		return itemsCustomMapper.queryItems(itemsQueryVo);
	}

}
