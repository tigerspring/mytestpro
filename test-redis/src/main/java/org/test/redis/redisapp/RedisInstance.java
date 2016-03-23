package org.test.redis.redisapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class RedisInstance {

	@Autowired
	private JedisPool jedisPool;
	
	public Jedis getJedis(){
		
		return jedisPool.getResource();
	}
	
	public void returnResource(Jedis jedis){
		jedisPool.returnResource(jedis);
	}
}
