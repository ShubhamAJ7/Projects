package com.cowid.Service;

import java.util.List;

import com.cowid.entity.Cowid;

public interface CowidService {
    Cowid addCowid(Cowid cowid);

	Cowid updateCowid(Cowid cowid);

	String removeCowid(int cowid);

	Cowid findCowidById(int cid);

	 List<Cowid> listCowid();

     List<Cowid> queryCowid();
    
}
