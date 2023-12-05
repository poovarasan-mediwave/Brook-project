package Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Manager_User {

	public static Properties prop;
	public Manager_User() throws Exception {
		File f = new File("src\\main\\java\\Configuration_Properties\\Configuration.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		 prop = new Properties();
		 prop.load(fis);
	}
	
}
