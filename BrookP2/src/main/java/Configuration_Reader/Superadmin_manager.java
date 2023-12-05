package Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Superadmin_manager {
	public static Properties prop;
	
	public Superadmin_manager() throws IOException {
		File f = new File("src\\main\\java\\Configuration_Properties\\Configuration.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		 prop = new Properties();
		 prop.load(fis);
	}

	public String getTeamemailadress() {
		String TeamEmail= prop.getProperty("TeamMemberEmail");
		return TeamEmail;
	}
	public String getTeamConfirmemail() {
		String teamcofirmEmail=prop.getProperty("TeamMemberConfirmEmail");
		return teamcofirmEmail;
	}
	public String getlocation1() {
		String  location1= prop.getProperty("Location1");
		return location1;
	}
	public String getlocation2() {
		String  location2= prop.getProperty("Location2");
		return location2;
	}
	public String getManagerEmail() {
		String managerEmail=prop.getProperty("managerEmail");
		return managerEmail;
	}
	public String getManagerPassword() {
		String managerpassword=prop.getProperty("managerPassword");
		return managerpassword;
	}
}
