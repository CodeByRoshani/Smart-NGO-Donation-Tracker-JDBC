package com.Smart_NGO_DonationTracker_JDBC;



public class Donor {

	private String name;
	private double amount;
	private String category;
	public Donor(String name, double amount, String category) {
		
		this.name = name;
		this.amount = amount;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Donar name=" + name + ", amount=" + amount + ", category=" + category + " ";
	}

}

