package org.ericsson.sonar.report;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SonarReportService {
	
	
	
	private static final Logger LOGGER= Logger.getLogger(SonarReportService.class);
	
	@Autowired
	private SonarClient client;
	
	public void generate(){
		LOGGER.info("Inside generate..");
		//client.getTarget("hello");
	}

}
