package com.hporg.utility.eventmonitor.storageservice.applauncher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages="com.hporg.utility.eventmonitor.storageservice")
public class EventMonitorStorageServiceApplication {

	private static final Logger LOG = LogManager.getFormatterLogger(EventMonitorStorageServiceApplication.class);
	
	public static void main (String [] args) {
		LOG.debug("Starting Event Monitor Storage Service.");
		SpringApplication.run(EventMonitorStorageServiceApplication.class);
	}
}
