package com.app.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

import com.mani.dao.IRetrieveDao;
import com.mani.service.RetrieveServiceImpl;

public class TestRetrieveService_02 {

	@Test
	public void testRetriveMethod()
	{
		IRetrieveDao proxyMock=EasyMock.createMock(IRetrieveDao.class);
		List<String> sList=new ArrayList<String>();
		sList.add("hello");
		sList.add("mani");
		sList.add("teja");
		sList.add("sai");

		EasyMock.expect(proxyMock.getAllNames(110)).andReturn(sList);
		EasyMock.replay(proxyMock);
		
		RetrieveServiceImpl sImpl=new RetrieveServiceImpl();
		sImpl.setDao(proxyMock);
		List<String> sorlist=sImpl.getAllNames(110);
		assertNotNull(sorlist);
	}
}
