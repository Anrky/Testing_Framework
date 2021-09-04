package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigRead {
	
	public static Properties configProperties(String filename) throws Exception{
		filename = filename.trim();
		
		Properties configProperties = new Properties();
		
		InputStream inStream = new FileInputStream(filename);
		configProperties.load(inStream);
		
		return configProperties;
		
		
	}

}
