package org.javabrains.shape;

import java.util.List;

public class Square {
    
	private List<Point> points;
     
	public void draw(){
	     for(Point p:points){
	    	 System.out.println(p);
	     }
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
