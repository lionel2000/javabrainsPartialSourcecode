package org.javabrains.shape;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square implements ApplicationContextAware,BeanNameAware {
	public static Logger log = Logger.getLogger(Square.class);
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("x:" + pointA +"y:" + pointB +"z:" + pointC );
	}

	@Override
	public void setBeanName(String beanName) {
	     log.info("Square setBeanName is called and the beanName is " + beanName);	
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		log.info("Square setApplicationContext is called" + context);
		this.context = context;
	}
}
