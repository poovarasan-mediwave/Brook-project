package Configuration_Reader;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Age16_17_autoApprove {

	public static Properties prop;
	
	public Age16_17_autoApprove() throws IOException {
		File f = new File("src\\main\\java\\Configuration_Properties\\Configuration.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		 prop = new Properties();
		 prop.load(fis);
	}

	
	public String getaddressline1() {
		String addressline1 = prop.getProperty("Addressline1");
		return addressline1;
	}
	public String getaddressline2() {
		String addressline2 = prop.getProperty("Addressline2");
		return addressline2;
	}
	public String getaddressline3() {
		String addressline3 = prop.getProperty("Addressline3");
		return addressline3;
	}
	
	public String gettown() {
		String town = prop.getProperty("town");
		return town;
	}

}
