package org.test.redisson;

import org.redisson.Config;
import org.redisson.Redisson;
import org.redisson.core.RLock;


public class Temp {

	static int count = 20;
	
	public static void main(String args[]){
		Config config = new Config();
		config.useSingleServer().setAddress("192.168.80.131:6379");
		Redisson redisson = (Redisson) Redisson.create(config);
	}
	
	public int downCount(){
		Config config = new Config();
		config.useSingleServer().setAddress("192.168.80.131:6379");
		Redisson redisson = (Redisson) Redisson.create(config);
		RLock lock = (RLock) redisson.getLock("haogrgr");
		lock.lock();
		try{
			count--;
		}finally{
			lock.unlock();
		}
		
		redisson.shutdown();
		
		return count;
	}
}

class MyThread implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		Temp tmp = new Temp();
		System.out.println(Thread.currentThread().getName()+"=========>count="+tmp.downCount());
	}
	
	
	
}
