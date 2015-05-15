package vn.edu.hcmuaf.model;

public class Comment {
	private String comment;

	private OddMovie oddMovie;
	private User user;
	
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public OddMovie getOddMovie() {
		return oddMovie;
	}

	public void setOddMovie(OddMovie oddMovie) {
		this.oddMovie = oddMovie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
