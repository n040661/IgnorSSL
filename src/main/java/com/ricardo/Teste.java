package com.ricardo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste/asl")
public class Teste {
	
	
	@RequestMapping(value = { "/", "" }, method = RequestMethod.POST)
	public String test(){
		IgnorSSL notSsl = new IgnorSSL();
		URL url = null;
		String str =  null;
		try {
			url = new URL("");
			str = notSsl.getXmlReturn(url);
			
		} catch (MalformedURLException e  ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
		return str;
		
	}	

}
