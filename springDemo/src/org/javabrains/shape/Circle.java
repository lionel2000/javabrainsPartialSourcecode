package org.javabrains.shape;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;


@Component
public class Circle {
	public static Logger log = Logger.getLogger(Circle.class);
	private Point center;

	public Point getCenter() {
		return center;
	}
	
  /*  @Required
    @Autowired
    @Qualifier("circleRelated") */   
	
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw(){
		log.info("Circle draw method is called and the center is x:" + center.getX()+" y:" +center.getX());
	}
	
    @PostConstruct
	public void init(){
		log.info(" init method is called");
	}
	@PreDestroy
	public void detroy(){
		log.info("destroy method is called");
	}

}
