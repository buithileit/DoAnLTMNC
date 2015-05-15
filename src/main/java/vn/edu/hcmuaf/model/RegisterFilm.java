package vn.edu.hcmuaf.model;

import java.util.Date;

public class RegisterFilm {
	private Date registerDate;
	private int noDate;
	
	private Film film;
	private User user;
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public int getNoDate() {
		return noDate;
	}
	public void setNoDate(int noDate) {
		this.noDate = noDate;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
