package org.test.redisson;

import org.redisson.Config;
import org.redisson.Redisson;
import org.redisson.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRedissonClient extends Initialize{
	
	public RedissonClient getSingleRedissonClient(){
		Config config = new Config();
		config.useClusterServers().set;
	}
}
