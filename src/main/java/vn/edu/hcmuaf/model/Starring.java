package vn.edu.hcmuaf.model;

import java.util.List;

public class Starring {

	private String name;
	private String avatar;
	private String price;
	
	private List<Film> listFilm; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public List<Film> getListFilm() {
		return listFilm;
	}
	public void setListFilm(List<Film> listFilm) {
		this.listFilm = listFilm;
	}
	
	
}
