/*
 2.	迴圏的練習-Factor
輸入一正整數，求其所有的因數。
說明：36的因數為1, 2, 3, 4, 6, 9, 12, 18, 36。

 */

package homework2;
import java.util.Scanner;
public class Factor {
	public static void main(String[] args) {
		int x;
		int factor=1;
		
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		scanner.close();
		
		
		for(factor=1;x>=factor;factor++) {
		    if(x%factor==0) {
				System.out.println(factor);
				continue;							
		 	}		
		   
		}
		
		
/*		while(x>=factor) {
		factor++;
		if(x%factor==0) {
			System.out.println(factor);
			continue;
		}	
		
	}
	
*/		
		
		
	}
}




