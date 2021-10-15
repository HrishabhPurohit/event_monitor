package com.hporg.utility.eventmonitor.storageservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/storage/v1")
public class StorageServiceController {

	@GetMapping("/users")
	public String listAllUsers() {
		return null;
	}
}
