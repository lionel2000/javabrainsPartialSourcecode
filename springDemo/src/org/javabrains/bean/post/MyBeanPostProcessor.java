package org.javabrains.bean.post;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class MyBeanPostProcessor implements BeanPostProcessor{
    public static Logger log = Logger.getLogger(MyBeanPostProcessor.class);
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		log.info(" after postProcessor is called and the bean name is" + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		log.info(" before postProcessor is called and the bean name is" + beanName);
		return bean;
	}

}
