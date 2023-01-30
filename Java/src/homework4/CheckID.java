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
		   if(id.charAt(0) >= 65 && id.charAt(0)<= 90)	{
			   if(id.substring(1,2).equals("1") || id.substring(1,2).equals("2")) {
				   if(id.substring(2,10).matches("[0-9]*")) {
					   return true;
				   }
				   return false;  
			   }
			   return false;  		   
			}
		   return false;  
		}
	          else {
	        	  return false;  
		      }
	}
	
	static boolean checklastnum(String id) {
//		String[] first= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int[] num= {10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};
		int first;
		first=num[id.charAt(0)-'A'];
		int english1=first/10;
		int english2=first%10;
		int[] n=new int[8];
		for(int i=0;i<8;i++) {
			n[i]=Integer.valueOf(id.substring(i+1,i+2));
		}
		int sum=english1+english2*9;
		int k=0;
			for(int j=8;j>0;j--) {
			 sum+=n[k]*j;
			 k++;
		}
		int checknum=sum%10;
		int check=10-checknum;
		if(check==10) {
			check=0;
		}
		if(check==Integer.valueOf(id.substring(9))){
			return true;
		}
		else {return false;}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String IDin=sc.next();
		
		if(isID(IDin)==true && checklastnum(IDin)==true) {
			System.out.println("此為正確身份証字號");
		}
		else {
			System.out.println("身份証字號輸入錯誤");
		}
		
		
		
		sc.close();
	}

}
