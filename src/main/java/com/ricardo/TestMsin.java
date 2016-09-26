package com.ricardo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class TestMsin {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		

		IgnorSSL notSsl = new IgnorSSL();
		URL url = null;
	
		
			url = new URL("https://api.avianca.com.br/refund/config/banklist/true");
			url.openConnection();
			System.out.println(">>>>>>>>>>>>>>>>   "+url.getContent());;
			
			System.out.println(notSsl.getXmlReturn(url));
			
		
		
		
	

	}

}
