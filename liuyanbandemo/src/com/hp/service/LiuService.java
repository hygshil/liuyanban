package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.LiuYanBan;

public interface LiuService {
	//Ìí¼Ó
	public int  add(LiuYanBan liuYanBan);
	//È«²é
	ArrayList<LiuYanBan> queryAll();
}
