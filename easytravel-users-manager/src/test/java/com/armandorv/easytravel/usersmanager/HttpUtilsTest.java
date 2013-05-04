package com.armandorv.easytravel.usersmanager;

import junit.framework.Assert;

import org.junit.Test;

import com.armandorv.easytravel.usersmanager.util.HttpUtils;

public class HttpUtilsTest {

	@Test
	public void testCheckConnection() {
		// Check that ws is available
		Assert.assertTrue(HttpUtils.checkConnection());
	}

}
