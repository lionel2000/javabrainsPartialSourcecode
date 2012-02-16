package org.javabrains.study;

import org.apache.log4j.Logger;
import org.javabrains.shape.Square;
import org.javabrains.shape.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {
	
	public static Logger log = Logger.getLogger(DrawingApp.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		log.info("initiall the context");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();
		Square sq = (Square) context.getBean("square");
		sq.draw();
        
	}

}
