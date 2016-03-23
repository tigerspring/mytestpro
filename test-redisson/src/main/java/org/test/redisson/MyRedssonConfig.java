package org.test.redisson;

import org.redisson.Config;
import org.redisson.SingleServerConfig;

public class MyRedssonConfig extends Config{

	private SingleServerConfig singleServerConfig;
	
	public void setSingleServerConfig(SingleServerConfig singleServerConfig){
		this.singleServerConfig = singleServerConfig;
	}
	
	public SingleServerConfig getSingleServerConfig(){
		return this.singleServerConfig;
	}
}
