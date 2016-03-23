package org.test.redisson.conf;

import org.redisson.Config;
import org.redisson.SingleServerConfig;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.StringUtils;

public class RedissonConfig implements InitializingBean  {

	private Config config;

	private String hostName = "";
	private int port = 6381;
	private int timeout = 60000;
	private String password;
	private int database = 0;
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		config = new Config();
		SingleServerConfig singleServerConfig = config.useSingleServer();
		singleServerConfig.setAddress(hostName + ":" + port)
				.setTimeout(timeout).setDatabase(database);
		if(StringUtils.isEmpty(password)){
			singleServerConfig.setPassword(password);
		}
	}
	public Config getConfig() {
		return config;
	}
	public void setConfig(Config config) {
		this.config = config;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	
	
}
