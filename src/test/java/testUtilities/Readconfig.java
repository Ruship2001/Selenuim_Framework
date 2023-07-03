package testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
Properties pro;

public Readconfig() {
	File src=new File("C:\\Users\\RUSHIKESH PAWAR\\eclipse-workspace\\FirstMav1\\config\\config.properties");
	try {
		FileInputStream fo=new FileInputStream(src);
		pro=new Properties();
		pro.load(fo);
		
	}
	catch(Exception e) {
		System.out.println("error is =" + e.getMessage());
	}
	
}
public String getApplicationURL() {
	String url=pro.getProperty("baseURL");

	return url;
}
public String getUsername() {
	String username=pro.getProperty("username");
return username;
}
public String getPassword() {
	String password=pro.getProperty("password");
	return password;
	
}

}
