package org.test.observer.version2.obserobj;

import org.test.observer.version2.Secretary;

public abstract class Observer {
	
	protected String name;
	protected Secretary secretary; 
	
	
	public Observer(String name,Secretary secretary){
		this.name = name;
		this.secretary = secretary;
	}

	public abstract void update();
}
