package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.LiuYanBan;

public interface LiuDao {
	//���
	public int  insert(LiuYanBan liuYanBan);
	//ȫ��
	ArrayList<LiuYanBan> selectAll();
}
