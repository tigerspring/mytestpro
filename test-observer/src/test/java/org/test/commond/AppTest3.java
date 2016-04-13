package org.test.commond;

import org.junit.Test;
import org.test.commond.version3.Waiter;
import org.test.commond.version3.BakeChickenWing;
import org.test.commond.version3.BakeMutton;
import org.test.commond.version3.Barbecure;
import org.test.commond.version3.command.Command;

public class AppTest3 {

	@Test
	public void testVersion3(){
		Barbecure boy = new Barbecure();
		
		Command command1 = new BakeMutton(boy);
		Command command2 = new BakeChickenWing(boy);
		Command command3 = new BakeMutton(boy);
		
		Waiter girl = new Waiter();
		girl.setOrders(command1);
		girl.setOrders(command2);
		girl.setOrders(command3);
		
		girl.cancelOrder(command3);
		
		
		girl.notifyX();
	}
}
