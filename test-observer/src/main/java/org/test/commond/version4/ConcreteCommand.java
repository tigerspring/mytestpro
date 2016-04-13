package org.test.commond.version4;

import org.test.commond.version4.command.Command;

public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void excute() {
		receiver.action();
	}

}
