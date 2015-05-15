package vn.edu.hcmuaf.model;

public class OddMovie extends Film{

	private  int noViews;
	private	Comment comment;
	private int rate;
	public int getNoViews() {
		return noViews;
	}
	public void setNoViews(int noViews) {
		this.noViews = noViews;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
}
