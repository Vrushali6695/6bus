package com.app.service;

import java.util.List;


import com.app.dto.ApiResponse;
import com.app.entities.Bus;


public interface BusService {
	
	//get
	List<Bus> getAllBuses();

	//add
	ApiResponse addBusDetail(Bus transientBus);

	//update
	ApiResponse updateBus(Bus detachedBus);
	
	//delete by id
	String removeBus(Long id);

	Bus getBusById(Long id);
	
	

}
