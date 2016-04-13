package org.test.commond.version3;

import org.test.commond.version3.Barbecure;
import org.test.commond.version3.command.Command;

public class BakeChickenWing extends Command {

	public BakeChickenWing(Barbecure receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}
	
	@Override
	public String toString() {
		return "命令模式.烤鸡翅";
	}

}
