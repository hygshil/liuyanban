package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.LiuDao;
import com.hp.entity.LiuYanBan;

@Service
public class LiuServiceImpl implements LiuService{
@Autowired
private LiuDao liuDao;

@Override
public int add(LiuYanBan liuYanBan) {
	// TODO 自动生成的方法存根
	int i = liuDao.insert(liuYanBan);
	return i;
}

@Override
public ArrayList<LiuYanBan> queryAll() {
	// TODO 自动生成的方法存根
	ArrayList<LiuYanBan> liuyanban = liuDao.selectAll();
	return liuyanban;
}



}
