package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;

public class Property {
	Properties prop = new Properties();
	
	void loadProperties() {
		File f = new File("./src/main/java/config/config.properties");
		try (InputStream is = new FileInputStream(f)) {
			prop.load(is);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String propertyToGet) {
		String property;
		loadProperties();
		property = prop.getProperty(propertyToGet);
		return property;
	}
}
