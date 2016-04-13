package org.test.commond;

import org.junit.Test;
import org.test.commond.version1.Barbecuer;

public class AppTest {

	@Test
	public void testVersion1(){
		Barbecuer barbecuer = new Barbecuer();
		barbecuer.BakeChickenWing();
		
		barbecuer.BakeMutton();
		barbecuer.BakeChickenWing();
		barbecuer.BakeMutton();
		barbecuer.BakeMutton();
		barbecuer.BakeMutton();
		barbecuer.BakeMutton();
	}
}
