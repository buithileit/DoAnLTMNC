package vn.edu.hcmuaf.model;

public class RechargeCard {

	private String id;
	private CardTypeEnum type;
	private User user;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public CardTypeEnum getType() {
		return type;
	}
	public void setType(CardTypeEnum type) {
		this.type = type;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
