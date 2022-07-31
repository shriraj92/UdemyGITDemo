import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDerive {

	public static void main(String[] args) throws IOException {
		//To derive values from properties file.There is a Properties class in java to retrieve the values
		
		Properties prop = new Properties();
		//creating an object of an file can be done with FIS
		FileInputStream fis = new FileInputStream("C:\\softwares\\Eclipse\\Eclipse Workspace\\UdemySeleniumCourse\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");		//This line updates the property only in ur code.
		//It doesnt update in property file....To update in property file.FileOutputStream class shld be used
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\softwares\\Eclipse\\Eclipse Workspace\\UdemySeleniumCourse\\src\\data.properties");
		prop.store(fos, "browserupdate");
	
	}

}
