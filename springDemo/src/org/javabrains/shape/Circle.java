package org.javabrains.shape;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


@Component
public class Circle {
	public static Logger log = Logger.getLogger(Circle.class);
	private Point center;
    MessageSource messageSource;
	public MessageSource getMessageSource() {
		return messageSource;
	}
	
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

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
		log.info(messageSource.getMessage("draw.circle", null,null));
		log.info(messageSource.getMessage("draw.circle.pattern", new Object[]{center.getX(),center.getY()},null));
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
