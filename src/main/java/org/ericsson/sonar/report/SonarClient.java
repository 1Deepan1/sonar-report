package org.ericsson.sonar.report;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class SonarClient {

	private static final String url = System.getProperty("sonar-report.sonar.server");
	
	private static final Logger logger = Logger.getLogger(SonarClient.class);

	private static SonarClient client = new SonarClient();

	private SonarClient() {
	}

	public SonarClient getSonarClient() {
		return client;
	}

	public WebTarget getTarget(String path) {
		Client client = ClientBuilder.newClient();		
		return client.target(url).path(path);
	}

}
