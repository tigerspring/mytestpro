package org.test.commond.version3;

import org.test.commond.version3.Barbecure;
import org.test.commond.version3.command.Command;

public class BakeMutton extends Command {

	public BakeMutton(Barbecure receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeMatton();
	}
	
	@Override
	public String toString() {
		return "命令模式.烤羊肉";
	}

}
