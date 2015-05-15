package vn.edu.hcmuaf.model;

public class Rate {

	private RateEnum starNo;

	private User user;
	private OddMovie oddMovie;
	
	public RateEnum getStarNo() {
		return starNo;
	}

	public void setStarNo(RateEnum starNo) {
		this.starNo = starNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public OddMovie getOddMovie() {
		return oddMovie;
	}

	public void setOddMovie(OddMovie oddMovie) {
		this.oddMovie = oddMovie;
	} 
	
	
}
