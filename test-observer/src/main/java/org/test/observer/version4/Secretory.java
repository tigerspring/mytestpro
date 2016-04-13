package org.test.observer.version4;

import org.test.observer.version4.event.EventHandler;
import org.test.observer.version4.observer.Subject;


public class Secretory implements Subject {
	
	private EventHandler eventHandler; 
	
	private String action;

	public EventHandler getEventHandler() {
		if(eventHandler ==null ){
			this.eventHandler = new EventHandler(); 
		}
		return eventHandler;
	}

	public void addListener(Object object, String methodName, Object... args) {

		getEventHandler().addEvent(object, methodName, args);
		
	}
	
	

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void notifyX() {
		try {
			getEventHandler().notifyX();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
