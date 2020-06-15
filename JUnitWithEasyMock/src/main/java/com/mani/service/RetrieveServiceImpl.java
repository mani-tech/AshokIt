package com.mani.service;

import java.util.Collections;
import java.util.List;

import com.mani.dao.IRetrieveDao;

public class RetrieveServiceImpl implements IRetrieveService {

	private IRetrieveDao dao;
	
	public IRetrieveDao getDao() {
		return dao;
	}

	public void setDao(IRetrieveDao dao) {
		this.dao = dao;
	}

	public int sub(int a,int b)
	{
		return a-b;
	}
	public List<String> getAllNames(Integer id) {
		List<String> list=dao.getAllNames(id);
		Collections.sort(list);
		return list;
	}

}
