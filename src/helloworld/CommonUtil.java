package helloworld;

import javax.security.auth.login.Configuration;

public class CommonUtil {
		
	
	public static void main(String[] args) {
		Configuration c = Configuration.getConfiguration();
		c.getAppConfigurationEntry("config");
	}
	
	
}
