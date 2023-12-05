package Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Age_16_17_Flagged {
	
	public static Properties prop;
	
	public Age_16_17_Flagged() throws IOException {
		File f = new File("src\\main\\java\\Configuration_Properties\\Configuration.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		 prop = new Properties();
		 prop.load(fis);
	}
	
	
	public String getpostCode() {
		String postcode= prop.getProperty("Postcode");
		return postcode;
	}
	public String getfname() {
		String fn= prop.getProperty("Fname");
		return fn;
	}
	public String getlname() {
		String ln= prop.getProperty("LName");
		return ln;
	}
	public String getmobileno2() {
		String mn= prop.getProperty("mobileno2");
		return mn;
	}
	public String getemailadress() {
		String emailid= prop.getProperty("Emailaddress");
		return emailid;
	}


}
