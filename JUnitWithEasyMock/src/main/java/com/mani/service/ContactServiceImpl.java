package com.mani.service;

import com.mani.dao.IContactDao;

public class ContactServiceImpl implements IContactService {

	private IContactDao contactDao;
	
	//By using setter method data is injected to instance variable
	public void setContactDao(IContactDao contactDao) {
		this.contactDao = contactDao;
	}

	
	public String findNamebyId(Integer id) {
		String name=contactDao.findNameById(101);
		String finalName=name.toUpperCase();
		
		return finalName;
	}

	
	
}
