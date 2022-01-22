package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) throws IOException {
		//Step:01 Get the java representation object of the physical file
		FileInputStream fis =new FileInputStream("./Data/CommonData.properties");
		
		//Step :02 Create an object to properties class to load all the keys
		Properties prop=new Properties();
		prop.load(fis);
		
		//Step:03 Read the value using getProperty("key")
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//webdriver driver=new chromedriver();
		
		
	}
}
