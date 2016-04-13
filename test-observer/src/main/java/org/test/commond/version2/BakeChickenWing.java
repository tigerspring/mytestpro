package org.test.commond.version2;

import org.test.commond.version2.cmd.Commond;

public class BakeChickenWing extends Commond {

	public BakeChickenWing(Barbecure receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}

}
