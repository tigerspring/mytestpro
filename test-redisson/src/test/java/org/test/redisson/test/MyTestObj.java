package org.test.redisson.test;

import org.junit.Test;
import org.redisson.Config;
import org.redisson.Redisson;
import org.redisson.RedissonClient;
import org.redisson.SingleServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.test.redisson.Subcriber;

public class MyTestObj extends AppTest{

	
	@Autowired
	private Config config;
	
	@Test
	public void test(){
		config.useSingleServer().setAddress("192.168.108.149:6381");
		RedissonClient redissonClient = Redisson.create(config);
		for(String key : redissonClient.getKeys().getKeys()){
			System.out.println(key);
		}
		
		
	}
}
