package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Bus;
import com.app.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	private BusService busService;
	
	public BusController() {
		System.out.println("in ctor of "+getClass());
	}
	
	@GetMapping
	public List<Bus> showAllBuses()
	{
		return busService.getAllBuses();
	}
	
	@PostMapping
	public ResponseEntity<?> addBus(@RequestBody Bus transientBus)
	{
		return new ResponseEntity<>(busService.addBusDetail(transientBus),HttpStatus.CREATED);
	}
	
	

	@PutMapping()
	public ResponseEntity<?> updateBus(@RequestBody Bus detachedBus)
	{
		return new ResponseEntity<>(busService.updateBus(detachedBus),HttpStatus.CREATED);
	}
	
	 @GetMapping("/{id}")
	    public Bus getBusById(@PathVariable Long id) {
	        return busService.getBusById(id);
	    }
	
	
	@DeleteMapping("/{id}")
	public String deleteBus(@PathVariable Long id)
	{
		return busService.removeBus(id);
	}
	

}
