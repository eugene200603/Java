//1.	綜合的練習-CheckID
//寫一函數boolean isID (String id)用來判斷id是否為正確身份証字號。
//提示：檢查是否有十個字元
//　　　檢查第一個字元是否為英文字母
//　　　檢查第二個字元是否為1或2數字
//　　　檢查第三個至第十個字元是否為數字
//　　　檢查最後一個檢查碼是否正確（檢查碼的規則請查網路）

package homework4;
import java.util.Scanner;
public class CheckID {

	static boolean isID(String id) {
		
		if(id.length()==10) {
			return true;}
		else if(id.charAt(0)<90 && id.charAt(0)>65)	{
			return true;}
		  else if(id.substring(1,2)=="1" || id.substring(1,2)=="2") {
				return true;}
		    else if(Integer.valueOf(id.substring(2,10))>=0 && Integer.valueOf(id.substring(2,10)) <=99999999) {
				return true;}
	          else {
	        	  return false;
	        	  
		      }
		
	   
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String IDin=sc.next();
		
		if(isID(IDin)) {
			System.out.println("此為正確身份証字號");
		}
		else {
			System.out.println("身份証字號輸入錯誤");
		}
		System.out.println(IDin);
		
		char x=65;
		System.out.println(x);
		sc.close();
	}

}