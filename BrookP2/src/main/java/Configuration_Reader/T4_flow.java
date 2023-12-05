package Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class T4_flow {
	public static Properties prop;

	public T4_flow() throws Throwable {
		File f = new File("src\\main\\java\\Configuration_Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
	}

	public String getBrowser() {
		String url = prop.getProperty("browser");
		return url;
	}

	public String getSTIkit_URL() {
		String url = prop.getProperty("STI_kit_URL");
		return url;
	}

	public String getpostcode() {
		String postcode = prop.getProperty("posstcode");
		return postcode;
	}

	public String getAddress() {
		String address = prop.getProperty("Address");
		return address;
	}

	public String getTown() {
		String town = prop.getProperty("Town1");
		return town;
	}

	public String getgender() {
		String gender = prop.getProperty("gender");
		return gender;
	}
}
