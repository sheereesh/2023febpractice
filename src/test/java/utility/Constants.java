package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Constants {
	
	private static final String Browser_Url_Properties_Filename ="Browser_Url";
	private static final String Excel_Excel_Sheet_Filename ="data" ;
	private static final String get_Excel_Sheet_Name = "names";
	private static final String RowNO="2";

	public static String get_Browser_Url_Properties_Filename() {
		
		return Browser_Url_Properties_Filename;
	}
	
	public static String  get_Excel_Sheet_Filename() {
		return Excel_Excel_Sheet_Filename;
		
	}
	public static String get_Excel_Sheet_Name() {
		
		return get_Excel_Sheet_Name;
	}
	public static String  getRowNumber() {
		return RowNO;
		
	}

	
}
