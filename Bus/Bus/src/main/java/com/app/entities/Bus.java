package com.app.entities;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "buses")
public class Bus extends BaseEntity {
	@Column(name = "bus_name", length=20)
    private String busName;
	@Column(length=50)
    private String destination;

    @Column(name = "bus_type", length=20)
    private String busType;

    @Column(name = "departure_time")
    private LocalTime departureTime;

    @Column(name = "arrival_time")
    private LocalTime arrivalTime;

    @Column(name = "total_seat")
    private int totalSeat;

    private double price;


    public Bus() {
		// TODO Auto-generated constructor stub
	}


	public Bus(String busName, String destination, String busType, LocalTime departureTime, LocalTime arrivalTime,
			int totalSeat, double price) {
		super();
		this.busName = busName;
		this.destination = destination;
		this.busType = busType;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.totalSeat = totalSeat;
		this.price = price;
	}


	public String getBusName() {
		return busName;
	}


	public void setBusName(String busName) {
		this.busName = busName;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getBusType() {
		return busType;
	}


	public void setBusType(String busType) {
		this.busType = busType;
	}


	public LocalTime getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}


	public LocalTime getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public int getTotalSeat() {
		return totalSeat;
	}


	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Bus [busName=" + busName + ", destination=" + destination + ", busType=" + busType + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", totalSeat=" + totalSeat + ", price=" + price
				+ ", Id()=" + getId() + "]";
	}
    
    
	  
	


}
