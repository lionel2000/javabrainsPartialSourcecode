package org.javabrains.shape;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "my Own DrawEvent toString method";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
