package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.Bus;
import com.app.repository.BusRepository;

@Service
@Transactional
public class BusServiceImpl implements  BusService {
	
	@Autowired
	private BusRepository busrepo;

	@Override
	public List<Bus> getAllBuses() {
		// TODO Auto-generated method stub
		return busrepo.findAll();
	}

	@Override
	public ApiResponse addBusDetail(Bus transientBus) {
		String msg="Adding Book Failed";
		Bus bus=busrepo.save(transientBus);
		if(bus != null)
		{
			msg="Bus added Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse updateBus(Bus detachedBus) {
		String msg="Updating  Bus  Failed";
		Bus bus=busrepo.save(detachedBus);
		if(bus != null)
		{
			msg="Bus details updated Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public String removeBus(Long id) {
		String mesg="Id invalid cannot delete record";
		if(busrepo.existsById(id))
		{
			busrepo.deleteById(id);
			mesg="Deleted Successfully";
		}
		
		return mesg;
	
	}

	@Override
	public Bus getBusById(Long id) {
		// TODO Auto-generated method stub
		return busrepo.findById(id).orElse(null);
	}
	
	
}
