package com.cowid.Service;
import java.util.List;

import javax.transaction.Transactional;

import com.cowid.dao.CowidDao;
import com.cowid.entity.Cowid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CowidServiceImpl implements CowidService {
	@Autowired
	private CowidDao dao;
	@Override
	public Cowid addCowid(Cowid cow) {  
	
		return dao.addCowid(cow);
	}
	@Override
	public Cowid updateCowid(Cowid cow) {
		return dao.updateCowid(cow);
	}
	@Override
	public String removeCowid(int cow) {
		return dao.removeCowid(cow);
	}
	@Override
	public Cowid findCowidById(int cid) {
		// no need of transaction, as it's an read operation
		Cowid cow = dao.getCowidById(cid);
		return cow;
	}
	@Override
	public List<Cowid> listCowid() {
		List<Cowid> l1 = dao.listCowid();
		return l1;

	}
	@Override
	public List<Cowid> queryCowid() {
		List<Cowid> l2 = dao.listCowid();
		return l2;
	}
    
}


