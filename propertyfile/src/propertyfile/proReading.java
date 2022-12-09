package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class proReading {

	public static void main(String[] args){

		
		String filePath=System.getProperty("user.dir")+"\\testdata\\testdata.properties";

		System.out.println(getValueFromProp(filePath, "appUrl"));
		System.out.println(getValueFromProp(filePath, "username"));
		System.out.println(getValueFromProp(filePath, "pwd"));
	}

	public static String getValueFromProp(String propLocation,String key) {
		FileInputStream fis;
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(propLocation);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}

