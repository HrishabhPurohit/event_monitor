package com.hporg.utility.eventmonitor.storageservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/storage/v1")
public class StorageServiceController {

	private static final Logger LOG = LogManager.getLogger(StorageServiceController.class);
	
	@GetMapping("/users")
	public String listAllUsers() {
		return null;
	}
}
