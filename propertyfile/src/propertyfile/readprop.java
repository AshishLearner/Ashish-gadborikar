package propertyfile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class readprop {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis=new FileInputStream("./testdata/testdata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("pass"));
		
	}

}
