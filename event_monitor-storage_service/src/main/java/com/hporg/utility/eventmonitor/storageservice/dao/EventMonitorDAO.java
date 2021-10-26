package com.hporg.utility.eventmonitor.storageservice.dao;

import org.springframework.data.repository.CrudRepository;

public interface EventMonitorDAO<T, ID> extends CrudRepository<T, ID>{}
