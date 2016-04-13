package org.test.observer.version4.event;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {

	private List<Event> objects;
	
	public EventHandler(){
		objects = new ArrayList<Event>();
	}
	
	public void addEvent(Object object,String metodName,Object... args){
		objects.add(new Event(object,metodName,args));
	}
	
	public void notifyX() throws Exception{
		for(Event e : objects){
			e.invoke();
		}
	}
}
