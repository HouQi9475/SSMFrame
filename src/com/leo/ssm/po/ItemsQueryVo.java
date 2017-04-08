package com.leo.ssm.po;

/**
 * 定义一个查询商品包装类
 * 从表现层可以一直传到持久层
 * @author Administrator
 *
 */
public class ItemsQueryVo {
    private Items items;
    
    //为了系统的可扩展性，将原始生成的Po进行扩展
    private ItemsCustom itemsCustom;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
    
    
}

