package org.test.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.test.redis.redisapp.RedisInstance;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class Lock 
{
	@Autowired
    private RedisInstance redisInstance;
	
	private Jedis jedis ;
	
	
    public boolean lock(String name,int timeout,int expire,int waitIntervalUs){
    	if(name == null) return false;
    	
    	Long nowTime = System.currentTimeMillis();
    	
    	Long timeOutAt = nowTime + timeout;
    	
    	Long expireAt = nowTime + expire;
    	
    	String redisKey = "Lock:"+name;
    	
    	jedis = redisInstance.getJedis();
    	
    	while(true){
    		Long result = jedis.setnx(redisKey, expireAt+"");
    		
    		if(result == 1){
    			jedis.expire(redisKey, expire);
    			return true;
    		}
    		
    		Long ttl = jedis.ttl(redisKey);
    		
    		if(ttl < 0){
    			jedis.set(redisKey, expireAt+"");
    			return true;
    		}
    		
    		if(timeout <= 0){
    			break;
    		}
    		
    	}
		return false;
    	
    	
    	
    }
}
