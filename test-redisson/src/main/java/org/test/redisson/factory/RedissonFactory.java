package org.test.redisson.factory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;


public class RedissonFactory implements DisposableBean,FactoryBean<RedissonTemplate>  {

	public void destroy() throws Exception {

	}

	public org.test.redisson.factory.RedissonTemplate getObject()
			throws Exception {
		return null;
	}

	public Class<?> getObjectType() {
		return null;
	}

	public boolean isSingleton() {
		return false;
	}

}
