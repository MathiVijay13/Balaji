package practiceDataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sampleDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		//step 1: get the java representation object of the physical file
		FileInputStream fis= new FileInputStream("./src/test/resources/cm.properties.txt");
		
		//step 2: using properties class load all the keys
		Properties pObj= new Properties();
		pObj.load(fis);
		
		//step 3: get the value based on keys
		System.out.println(pObj.getProperty("browser"));
		System.out.println(pObj.getProperty("url"));
	}
}
