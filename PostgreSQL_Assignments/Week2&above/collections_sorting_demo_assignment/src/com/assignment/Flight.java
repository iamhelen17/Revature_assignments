package com.assignment;

public class Flight {

	private int id;
	private String name;
	private String manufactureName;
	private double cost;
	private float ratings;
	private boolean available;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int id, String name, String manufactureName, double cost, float ratings, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.manufactureName = manufactureName;
		this.cost = cost;
		this.ratings = ratings;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", manufactureName=" + manufactureName + ", cost=" + cost
				+ ", ratings=" + ratings + ", available=" + available + "]";
	}
	
	
}
