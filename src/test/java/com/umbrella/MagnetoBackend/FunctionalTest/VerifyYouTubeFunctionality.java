package com.umbrella.MagnetoBackend.FunctionalTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


import com.umbrella.MagnetoBackend.generics.LoggerHelper;
import com.umbrella.MagnetoBackend.testCore.Config;
import com.umbrella.MagnetoBackend.testCore.TestBase;

public class VerifyYouTubeFunctionality extends TestBase {

	Config config;
	
	private static final Logger log = LoggerHelper.getLogger(VerifyYouTubeFunctionality.class);


	
	@Test
	public void SkipAddTest() throws InterruptedException
	{
		log.info(VerifyYouTubeFunctionality.class.getName() + " Method verifyYouTube " + " Get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		log.info("+++++++++++++++++++++Checking config MagnetoBackend++++++++++++++");
	}

}
