package org.test.commond.version3.command;

import org.test.commond.version3.Barbecure;

public abstract class Command {

	protected Barbecure receiver;
	
	public Command(Barbecure receiver){
		this.receiver = receiver;
	}
	
	public abstract void excuteCommand();
}
