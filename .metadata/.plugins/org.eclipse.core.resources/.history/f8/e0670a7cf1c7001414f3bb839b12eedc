package model;

import java.security.InvalidParameterException;

import utility.AnimalType;
import utility.insuranceCompany;

public class Pet extends Animal{
	private insuranceCompany inCo;
	private String insuranceNumber;
	
	public final int MAXIMUM_HEIGHT = 25;
	
	
	
	
	
	
	public Pet(insuranceCompany inCo, String insuranceNumber,String name, int weight, AnimalType anTy) {
		super(name, weight, anTy);
		if(inCo == null && insuranceNumber!= null){
			throw new InvalidParameterException("No insurance company added.");
		}else if(inCo != null && insuranceNumber == null){
			throw new InvalidParameterException("No insurance number added.");
		}
		this.inCo = inCo;
		this.insuranceNumber = insuranceNumber;
	}
	
	public void setInsurance(insuranceCompany inCo, String insuranceNumber) {
		this.inCo = inCo;
		this.insuranceNumber = insuranceNumber;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public insuranceCompany getInCo() {
		return inCo;
	}
	
	
}
