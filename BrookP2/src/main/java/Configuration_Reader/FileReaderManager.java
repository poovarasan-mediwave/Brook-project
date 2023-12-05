package Configuration_Reader;

import java.io.IOException;

import Page_Object_Model.Age18_AutoApprove_pom;

public class FileReaderManager {
	private FileReaderManager() {

	}

	public static FileReaderManager getInstanceFRM() {

		FileReaderManager f = new FileReaderManager();
		return f;
	}

	public Under_16Form getInstanceCR() throws IOException {

		Under_16Form c = new Under_16Form();
		return c;
	}

	public Age_16_17_Flagged getinstanceSR() throws IOException {
		Age_16_17_Flagged ar = new Age_16_17_Flagged();
		return ar;
	}

	public Age16_17_autoApprove getinstanceAA() throws IOException {
		Age16_17_autoApprove aa = new Age16_17_autoApprove();
		return aa;
	}

	public Age18_AutoApprove getinstanceAA18() throws IOException {
		Age18_AutoApprove aa18 = new Age18_AutoApprove();
		return aa18;
	}

	public Superadmin_manager getInstanceSA() throws IOException {
		Superadmin_manager SA = new Superadmin_manager();
		return SA;
	}

	public Superadmin_User getInstanceSU() throws IOException {
		Superadmin_User SU = new Superadmin_User();
		return SU;
	}

	public T4_flow gett4_flow() throws Throwable {

		T4_flow t4 = new T4_flow();
		return t4;

	}
}
