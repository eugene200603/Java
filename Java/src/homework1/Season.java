/*1.	選擇性敘述的練習-Season
		輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”。*/
package homework1;
import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		int season;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入月份(1~12):");
		season = scanner.nextInt();
				
		switch(season) {
		  case 3,4,5:
			System.out.println("春");
		    break;
		  case 6,7,8:
			System.out.println("夏");
		    break;
		  case 9,10,11:
			System.out.println("秋");
		    break;
		  case 12,1,2:
			System.out.println("冬");
		    break;
		  default:
			System.out.println("輸入錯誤"); 
			
		scanner.close();
		}	
		
	}

}
