package java8;

public class predicaterules {

	
	String Username;
	String Password;
	public predicaterules (String username,String password) {
		this.Username=username;
		this.Password=password;
	}
	
	
	boolean isweek() {
		if(Password.length()<=3) {
			return true;
		}
		else {
			return false;
 		}
	}
}
