package com.leo.ssm.mapper;

import java.util.List;

import com.leo.ssm.po.ItemsCustom;
import com.leo.ssm.po.ItemsQueryVo;

public interface ItemsCustomMapper {

	//查询商品
	public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo);
}
