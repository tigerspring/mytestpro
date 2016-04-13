package org.test.commond.version4.command;

import org.test.commond.version4.Receiver;

public abstract class Command {

	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	public abstract void excute();
}
