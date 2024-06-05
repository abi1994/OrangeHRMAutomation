package com.abi.test.pageobject.Tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abi.test.pageobject.Utils.AdminTestBase;

public class RoomTest extends AdminTestBase{
	
	private static final Logger LOGGER =Logger.getLogger(RoomTest.class);
	
	@Test(priority=1)
	public void RoomAddTest() {
		softAssert =new SoftAssert();
		
	
	}

}
