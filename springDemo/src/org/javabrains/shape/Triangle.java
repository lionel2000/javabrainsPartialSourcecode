package org.javabrains.shape;

public class Triangle {
	
	private int height;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Triangle(String type) {
		super();
		this.type = type;
	}public Triangle(int height, String type) {
		super();
		this.height = height;
		this.type = type;
	}

	public Triangle() {
	}

	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println("triangle draw method is called!!! and the type is "  + getType() + "and the height is :" + getHeight());
	}
	public Triangle(int height) {
		super();
		this.height = height;
	}

	
}
