package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.LiuYanBan;

public interface LiuService {
	//���
	public int  add(LiuYanBan liuYanBan);
	//ȫ��
	ArrayList<LiuYanBan> queryAll();
}
