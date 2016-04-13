package org.test.commond;

import org.junit.Test;
import org.test.commond.version4.ConcreteCommand;
import org.test.commond.version4.Invoker;
import org.test.commond.version4.Receiver;
import org.test.commond.version4.command.Command;

public class AppTest4 {

	@Test
	public void testVersion4(){
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();
		
		i.setCommands(c);
		i.excuteCommand();
	}
}
