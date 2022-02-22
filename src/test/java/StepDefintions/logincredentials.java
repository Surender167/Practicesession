package StepDefintions;

import java.util.Map;

public class logincredentials   {
String username;	
String password;
public String getUsername() {
	return username;
}
public String getPassword() {
return password;
}
public  void setUsername(String username) {
	this.username = username;
	
}

public void  setPassword( String password) {
	this.password = password;
	
}

public static logincredentials createlogincredentials(Map<String, String>entry ) 
{
logincredentials cred = new logincredentials();
cred.setUsername(entry.get("username"));
return cred;
}
}

	


