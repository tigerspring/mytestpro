package org.test.commond;

import org.junit.Test;
import org.test.commond.version2.BakeChickenWing;
import org.test.commond.version2.BakeMuttonCommand;
import org.test.commond.version2.Barbecure;
import org.test.commond.version2.Waiter;
import org.test.commond.version2.cmd.Commond;

public class AppTest2 {

	@Test
	public void testVersion2(){
		Barbecure barbecure = new Barbecure();
		
		Commond Commond1 = new BakeChickenWing(barbecure);
		Commond Commond2 = new BakeMuttonCommand(barbecure);
		Commond Commond3 = new BakeChickenWing(barbecure);
		
		Waiter girl = new Waiter();
		girl.setOrder(Commond1);
		girl.notifyX();
		girl.setOrder(Commond2);
		girl.notifyX();
		girl.setOrder(Commond3);
		girl.notifyX();
	}
}
