package org.test.redisson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component
public class Subcriber {
	
//	@Autowired
	private MyRedissonClient myRedissonClient;
	
	
	
	public void printRedisson(){
		System.out.println(myRedissonClient);
	}
	
}
