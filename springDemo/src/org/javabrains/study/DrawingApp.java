package org.javabrains.study;

import org.apache.log4j.Logger;
import org.javabrains.shape.Circle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Triangle triangle = (Triangle) context.getBean("triangle");
//		triangle.draw();
		context.registerShutdownHook();
		Circle cl = (Circle) context.getBean("circle");
		cl.draw();
        
	}

}
