package com.cowid.dao;

import java.util.List;

import com.cowid.entity.Cowid;

public interface CowidDao{
     Cowid getCowidById(int cid);
     Cowid addCowid(Cowid cow);

	String removeCowid(int cid);

	Cowid updateCowid(Cowid cid);

	 List<Cowid> listCowid();
	 List<Cowid> queryCowid();
    
}
