package com.automobile.twowheeler;
import com.automobile.Vechicle;

public class Honda extends Vechicle
{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;

	public Honda(String modelName, String registrationNumber,String ownerName,int speed) 
	{
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;	
	}
	@Override
	public String getModelName() {
		return modelName;
	}

	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	@Override
	public String getOwnerName() {
		return ownerName;
	}
	
	public int getSpeed() {
		return speed;
	}
	}
