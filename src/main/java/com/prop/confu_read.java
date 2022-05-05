package com.prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class confu_read {
	public static Properties p;
	
	public confu_read() throws IOException {
		  File ff = new File("C:\\Users\\Prokarma\\Natural\\kids\\src\\main\\java\\com\\prop\\kl.properties");
			
		   FileInputStream ff1 =new FileInputStream(ff);
		   
		    p = new Properties();
		   p.load(ff1);

	}

	public String urllanc() throws IOException {
  
   
        String uurr = p.getProperty("url");
   
   return uurr;
   
   
	}
	public String username10() throws IOException {
		
		   
		String usenam = p.getProperty("username");
		
		return usenam;
		
	}
	
	public String pass100() throws IOException {

		
		   String pasw = p.getProperty("password");
		return pasw;
		
	}
	
	
}
