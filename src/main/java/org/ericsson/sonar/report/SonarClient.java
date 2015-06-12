package org.ericsson.sonar.report;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class SonarClient {

	private String url;
	
	public void setUrl(String url) {
		this.url = url;
	}

	private static final Logger LOGGER = Logger.getLogger(SonarClient.class);

	public WebTarget getTarget(String path) {
		LOGGER.info("Inside SonarClient..");
		Client client = ClientBuilder.newClient();	
		return client.target(url).path(path);
	}

}
