package model;

import utility.Sellable;

public class Treatment implements Sellable {
	private String name;
	private String currency = "USD";
	private double price = 0;
	
	//Constructor
	public Treatment(String name, double price, String currency) {
		super();
		this.name = name;
		this.currency = currency;
		this.price = price;
	}
	
	//Return Price
	public double getPrice() {
		/*if(price < 0){
			throw new IllegalStateException("Animal has a treatment costing less than zero; cannot be!");
		}*/
		return price;
	}
	
	//Price + Currency
	public String getPriceAndCurrency() {
		return String.valueOf(price) + " " + currency;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
