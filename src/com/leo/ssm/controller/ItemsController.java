package com.leo.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leo.ssm.po.ItemsCustom;
import com.leo.ssm.service.ItemsService;

@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	@RequestMapping("/query_list")
    public ModelAndView findItems() throws Exception{
    	List<ItemsCustom> itemsList=itemsService.queryItems(null);
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.addObject("itemsList", itemsList);
    	modelAndView.setViewName("items/items");
    	return modelAndView;
    }
}
