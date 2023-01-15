/*
選擇性敘述的練習-LeapYear
輸入一西元年，如2015。判斷此年份是否為閏年。
提示：每四年一閏，每百年不閏，每四百年一閏。
*/

package homework1;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入西元年:");
		year = scanner.nextInt();
		
		if (year%4==0) {
			if (year%100!=0) {
				System.out.println("是閏年");	
			   if(year%400==0) {
				System.out.println("是閏年");	
		       }	
	        }
		  else {
			  System.out.println("不是閏年");
		  }
			
		}
		  else {
				System.out.println("不是閏年");
		  }
		scanner.close();
	}
}
