package org.javabrains.shape;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements InitializingBean,DisposableBean {
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

	@Override
	public void destroy() throws Exception {
	    log.error("the bean has been destoryed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		log.error("aterProperties is set .I am show in red right?");
	}

}
