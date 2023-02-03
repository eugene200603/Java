import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		try {
			URL url=new URL("https://ws.ndc.gov.tw/Download.ashx?u=LzAwMS9hZG1pbmlzdHJhdG9yLzEwL3JlbGZpbGUvMC8xMTMzOS85YTM0NDZkOC1iOWU0LTRlOGUtYjE0Zi1kNWMyMjEzNTA1MTcuY3N2&n=6L%2bR5bm056aP5Yip5rSl6LK857Wm5LuY6YeR6aGNLmNzdg%3d%3d&icon=..csv");
		     InputStream openStream = url.openStream();
		        InputStreamReader isr = new InputStreamReader(openStream);
		      BufferReader bufferReader = new BufferReader(isr);
		      String str="";
		      while(str=bufferedReader.readLine())
		      
		      
		      
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
