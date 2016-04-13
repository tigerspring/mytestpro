package org.test.commond.version2;

import org.test.commond.version2.cmd.Commond;

public class BakeMuttonCommand extends Commond {

	public BakeMuttonCommand(Barbecure receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeMatton();
	}

}
