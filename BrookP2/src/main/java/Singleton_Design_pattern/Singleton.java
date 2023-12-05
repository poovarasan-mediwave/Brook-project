package Singleton_Design_pattern;

import java.io.IOException;

import Configuration_Reader.Age_16_17_Flagged;
import Lib_Global.Base_Class;
import Page_Object_Model.Age16_17_autoApprove_pom;
import Page_Object_Model.Age18_AutoApprove_pom;
import Page_Object_Model.Manager_User_pom;
import Page_Object_Model.Age_16_17_flagged_pom;
import Page_Object_Model.SuperAdmin_user_pom;
import Page_Object_Model.Superadmin_manager_pom;
import Page_Object_Model.T4_flow;
import Page_Object_Model.Under16Form_pom;

public class Singleton  {

	private Under16Form_pom under16form;
	private Age_16_17_flagged_pom sti16_17Form;
	private Age16_17_autoApprove_pom age16_17_autoApprove;
	private Age18_AutoApprove_pom age18_AutoApprove;
	private Superadmin_manager_pom superadmin_manager;
	private SuperAdmin_user_pom superadmin_User;
	private Manager_User_pom manager_user;
	private T4_flow t4_flow;

	public Under16Form_pom getunder16form() {

		under16form = new Under16Form_pom();
		return under16form;
	}

	public Age_16_17_flagged_pom getSTI16_17Form() throws IOException {
		sti16_17Form = new Age_16_17_flagged_pom();
		return sti16_17Form;
	}

	public Age16_17_autoApprove_pom getAge16_17_autoApprove() throws IOException {
		age16_17_autoApprove = new Age16_17_autoApprove_pom();
		return age16_17_autoApprove;

	}

	public Age18_AutoApprove_pom getAge18_AutoApprove() {
		age18_AutoApprove = new Age18_AutoApprove_pom();
		return age18_AutoApprove;
	}

	public Superadmin_manager_pom getsuperadmin_manager() {
		superadmin_manager = new Superadmin_manager_pom();
		return superadmin_manager;
	}

	public SuperAdmin_user_pom getsuperAdmin_user() {
		superadmin_User = new SuperAdmin_user_pom();
		return superadmin_User;

	}

	public Manager_User_pom getmanager_user() {
		manager_user = new Manager_User_pom();
		return manager_user;
	}

	public T4_flow gett4_flow() {
		t4_flow = new T4_flow();
		return t4_flow;
	}
}
