package org.javabrains.study;

import org.apache.log4j.Logger;
import org.javabrains.shape.Square;
import org.javabrains.shape.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {
	
	public static Logger log = Logger.getLogger(DrawingApp.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
//		Triangle triangle = (Triangle)factory.getBean("triangle");
		log.info("initiall the context");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Triangle triangle = (Triangle) context.getBean("triangle");
//		triangle.draw();
		Square sq = (Square) context.getBean("square");
		sq.draw();
        
	}

}
