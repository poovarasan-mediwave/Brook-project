package Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Superadmin_User {

	public static Properties prop;
	public Superadmin_User() throws IOException {
		File f = new File("src\\main\\java\\Configuration_Properties\\Configuration.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		 prop = new Properties();
		 prop.load(fis);
	}
	
	public String getUserEmail() {
		String UserEmail= prop.getProperty("UserEmail");
		return UserEmail;
	}
	public String getUserPassword() {
		String UserPassword= prop.getProperty("UserPassword");
		return UserPassword;
	}
}
