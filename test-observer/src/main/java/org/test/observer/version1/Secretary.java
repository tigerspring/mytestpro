package org.test.observer.version1;

import java.util.ArrayList;
import java.util.List;

import org.test.observer.version2.obserobj.Observer;

public class Secretary {

	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void attach(Observer so){
		observers.add(so);
	}
	
	public void Notify(){
		for(Observer so : observers){
			so.update();
		}
	}
	
	
	
	public String secretaryAction(){
		return getAction();
	}
	
}
