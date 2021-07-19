package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.LiuYanBan;

public interface LiuDao {
	//Ìí¼Ó
	public int  insert(LiuYanBan liuYanBan);
	//È«²é
	ArrayList<LiuYanBan> selectAll();
}
