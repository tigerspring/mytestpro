package org.test.observer.version5;

import java.util.Observable;

public class Boss extends Observable{
	

	public Boss(){
		super.setChanged();
	}
	
}
