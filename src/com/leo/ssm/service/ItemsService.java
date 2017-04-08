package com.leo.ssm.service;

import java.util.List;

import com.leo.ssm.po.ItemsCustom;
import com.leo.ssm.po.ItemsQueryVo;

public interface ItemsService {
	//查询商品
		public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo);
}
