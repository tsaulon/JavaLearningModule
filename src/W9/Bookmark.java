package W9;

public class Bookmark {
	private long id;
	private String title;
	// New 
	private double rating;
		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	//New
	public double getRating() {
		return rating;
	}

	//New
	public void setRating(double rating) {
		this.rating = rating;
	}
		
}
