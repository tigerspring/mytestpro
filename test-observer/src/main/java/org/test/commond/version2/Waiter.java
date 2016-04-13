package org.test.commond.version2;

import org.test.commond.version2.cmd.Commond;

public class Waiter {

	private Commond command;
	
	public void setOrder(Commond command){
		this.command = command;
	}
	
	public void notifyX(){
		this.command.excuteCommand();
	}
}
