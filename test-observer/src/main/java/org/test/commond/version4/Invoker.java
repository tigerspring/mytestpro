package org.test.commond.version4;

import java.util.ArrayList;
import java.util.List;

import org.test.commond.version4.command.Command;

public class Invoker {

	private List<Command> commands = new ArrayList<Command>() ;
	
	public void setCommands(Command command){
		this.commands.add(command);
	}
	
	public void cancelCommand(Command command){
		this.commands.remove(command);
	}
	
	public void excuteCommand(){
		for(Command command : this.commands)
			command.excute();
	}
}
