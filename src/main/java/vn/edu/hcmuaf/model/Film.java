package vn.edu.hcmuaf.model;

import java.util.List;

public abstract class Film {

	private String id;
	private String name;
	private double price;
	private List<Starring> listActor;
	private Director director;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Starring> getListActor() {
		return listActor;
	}
	public void setListActor(List<Starring> listActor) {
		this.listActor = listActor;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	
}
