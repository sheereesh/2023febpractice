package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private static FileInputStream obj_FIleFileInputStream;
	private static Properties obj_Properties; 
	
	public static Properties getProperties(String PropertyFilename) {
		try {
		 obj_FIleFileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+PropertyFilename+".properties");
		} catch (FileNotFoundException e) {
			 System.out.println("plz check the path");
		}
		
		  obj_Properties=new Properties();
		try {
			obj_Properties.load(obj_FIleFileInputStream);
		} catch (IOException e) {
			 System.out.println("please check the path");
		}
	
	return obj_Properties;
	}
	

}
