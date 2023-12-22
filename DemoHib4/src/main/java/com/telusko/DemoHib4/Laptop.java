package com.telusko.DemoHib4;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String brand;
	private int price;
	@ManyToOne
	private Alian alian;
	
	public Alian getAlian() {
		return alian;
	}
	public void setAlian(Alian alian) {
		this.alian = alian;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price + ", alian=" + alian + "]";
	}
	
}
