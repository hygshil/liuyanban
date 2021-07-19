package com.hp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.LiuYanBan;
import com.hp.service.LiuService;

@Controller
@RequestMapping("/liuyan")
public class LiuController {
	@Autowired
	private LiuService liuService;	
	//添加
		@RequestMapping("/add")
		public String addUser(LiuYanBan liuYanBan){
			int i = liuService.add(liuYanBan);
			if(i>0){
				System.out.println("添加成功");
				return "redirect:/liuyan/queryAll";
			}else{
				return "add";
			}
		}
		@RequestMapping("/queryAll")
		public String queryAll(HttpSession session){
			ArrayList<LiuYanBan> Liu = liuService.queryAll();
			//将数据存入作用域中
			session.setAttribute("Liu", Liu);
			return "add";
		}
}
