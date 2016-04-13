package org.test.commond.version2.cmd;

import org.test.commond.version2.Barbecure;

public abstract class Commond {

	protected Barbecure receiver;
	
	public Commond(Barbecure receiver){
		this.receiver = receiver;
	}
	
	public abstract void excuteCommand();
}
