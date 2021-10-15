package com.hporg.utility.eventmonitor.storageservice.applauncher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages="com.hporg.utility.eventmonitor.storageservice")
public class EventMonitorStorageServiceApplication {

	public static void main (String [] args) {
		SpringApplication.run(EventMonitorStorageServiceApplication.class);
	}
}
