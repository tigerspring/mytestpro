package org.test.observer.version3;

import java.util.ArrayList;
import java.util.List;

import org.test.observer.version3.observer.Observer;
import org.test.observer.version3.observer.Subject;

public class Boss implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	public void attache(Observer ob) {
		observers.add(ob);
	}

	public void detache(Observer ob) {
		observers.remove(ob);
	}

	public void Notify() {
		for(Observer ob:observers){
			ob.update();
		}
	}
	
	public String subjectState() {
		return getAction();
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setState(String str) {
		setAction(str);
	}

	
	
	

}
