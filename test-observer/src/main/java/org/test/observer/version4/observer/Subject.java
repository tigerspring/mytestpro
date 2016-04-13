package org.test.observer.version4.observer;

import org.test.observer.version4.event.EventHandler;



public interface Subject {

	public EventHandler getEventHandler();

    public abstract void addListener(Object object,String methodName,Object...args);  
    
    public String getAction();
    
    public void notifyX();
}
