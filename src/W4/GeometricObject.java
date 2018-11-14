package W4;

import java.util.Date;

public abstract class GeometricObject {
	
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObject() {
		this.color = "white";
		this.filled = false;
		this.dateCreated = new Date(0);	//	set default date
	}
	
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();	//	set current date
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public String toString() {
		return new String("color: " + this.color + ", filled: " + this.filled + ", dateCreated: " + this.dateCreated);
	}
	
	abstract double getArea();
	abstract double getParameter();
}
