package vn.edu.hcmuaf.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String id;
	private String username;
	private String password;
	private Date dateOfBirth;
	private Date accountCreateDate;
	private double accountAmount;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getAccountCreateDate() {
		return accountCreateDate;
	}

	public void setAccountCreateDate(Date accountCreateDate) {
		this.accountCreateDate = accountCreateDate;
	}

	public double getAccountAmount() {
		return accountAmount;
	}

	public void setAccountAmount(double accountAmount) {
		this.accountAmount = accountAmount;
	}

}
