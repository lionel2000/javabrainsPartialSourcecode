package org.javabrains.shape;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.BeanNameAware;

public class Square{
	public static Logger log = Logger.getLogger(Square.class);
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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

	/*@Override
	public void afterPropertiesSet() throws Exception {
		log.info("all property has been set" + getPointC());		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		log.info("Bean destroy message is called");
		
	}*/
	
	public void myInit(){
		log.info("init-method is called and the property is set too " + getPointC());	
	}
	public void myDestroy(){
		log.info("Bean destroy message is called");
		
	}
	
	
}
