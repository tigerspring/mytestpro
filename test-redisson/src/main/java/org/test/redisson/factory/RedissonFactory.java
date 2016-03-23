package org.test.redisson.factory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;


public class RedissonFactory implements DisposableBean,FactoryBean<RedissonTemplate>  {

	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	public org.test.redisson.factory.RedissonTemplate getObject()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
