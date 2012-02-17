package org.javabrains.study;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class MyEventListner implements ApplicationListener {
   
	public static Logger log = Logger.getLogger(MyEventListner.class);
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		log.error("*******" + event.toString());
	}

}
