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
	// TODO �Զ����ɵķ������
	int i = liuDao.insert(liuYanBan);
	return i;
}

@Override
public ArrayList<LiuYanBan> queryAll() {
	// TODO �Զ����ɵķ������
	ArrayList<LiuYanBan> liuyanban = liuDao.selectAll();
	return liuyanban;
}



}
