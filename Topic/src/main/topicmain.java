package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class topicmain {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.tainan.gov.tw/dataset/940bb791-eaf8-414f-8139-c229618043b1/resource/4d535c04-26ef-4927-889d-0003caf4627c/download/526e2224-f71b-48ff-98fe-a53e93cb8453.csv");			
		    InputStream openStream = url.openStream();			
		    InputStreamReader isr = new InputStreamReader(openStream);
		    BufferedReader br = new BufferedReader(isr);
		    String str="";
		    while((str=br.readLine())!=null) {
		    	//System.out.println(str);
		    	String[] split=str.split(",");
		    	for (int i = 0; i < split.length; i++) {
					String string=split[i];
					System.out.println(string);
				}
		    	
		    }
		    
		}catch (MalformedURLException e) {				
				e.printStackTrace();
		}
		catch (IOException e) {				
				e.printStackTrace();
		}
	}

}
