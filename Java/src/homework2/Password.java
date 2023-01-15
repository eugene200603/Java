/*
 8.	迴圏的練習-Password
出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
若輸入不正確，再次出現”請輸入密碼”的提示。
若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。
 */

package homework2;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("設定密碼");	
		String   password=sc.next();
		
		boolean a =true;
		
		System.out.println("請輸入密碼");
		for(int i=2;i>=0;i--) {
			
			
			String   passwordin=sc.next();
				
			if(passwordin.equals(password)) {
				System.out.print("密碼輸入正確，歡迎使用本系統！");	
				break;
			}
				
			  else {	
				System.out.println("輸入錯誤，請重新輸入密碼(剩餘"+i+"次機會)");
				a=false;
				continue;
				
			  }
			
		}
		         if(a==false) {
			     System.out.print("密碼輸入超過三次！");
		         }
			
		         sc.close();
		         
	}        
		
}
	
	   
//	 static void scclose() {
//    	 Scanner sc=new Scanner(System.in);
//    	 sc.close();
//         }
//}
