package org.javabrains.shape;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle {
	public static Logger log = Logger.getLogger(Circle.class);
	private Point center;

	public Point getCenter() {
		return center;
	}
    @Required
    @Autowired
    @Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw(){
		log.info("Circle draw method is called and the center is " + center.getX());
	}

}
