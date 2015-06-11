package org.ericsson.sonar.report;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
	
	@Autowired
	private SonarReportService service;

	public App() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"sonar-report.xml");
		AutowireCapableBeanFactory factory = context
				.getAutowireCapableBeanFactory();
		factory.autowireBean(this);
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();
		App app = new App();
		app.service.generate();
	}
}
