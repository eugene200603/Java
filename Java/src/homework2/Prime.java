/*
 5.	迴圈的練習-Prime
輸入一正整數，找出所有小於或等於的質數。

 */

package homework2;
import java.util.Scanner;
public class Prime {
	
	public static void main(String[] args) {
		
		int x;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個數字:");
		x = scanner.nextInt();
	
		System.out.println(x+"以內的質數有:");
		
for(int j=2;j<=x;j++) {
	boolean a=true;
	for(int i=2;i<j;i++) {
		
		  if(j%i==0) {
		  a=false;
		  break;
	      }
	}
	
	    if(a==true) {
		
		System.out.print(j+" ");
        }
}
				
	scanner.close();
	}
}


