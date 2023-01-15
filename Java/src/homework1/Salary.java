/*
選擇性敘述的練習-Salary
輸入便利商店工讀生的工作時數，並計算其薪資。
60小時以內，時薪150元。
61~80小時，以時薪1.25倍計算。
81小時以上，以時薪1.5倍計算。
說明：薪資以累計方式計算。若工時為90小時，則薪資為60*150 + 20*150*1.25 + 10*150*1.5元。
*/

package homework1;
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		int salary,time;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入工作時數:");
		time = scanner.nextInt();
		
		if(time<=60) {
			salary=(int)(150*time);
		     }
		else { 
			if (time<=80) {
			salary=(int)(150*60+(time-60)*150*1.25);
		     }
		else {
			salary=(int)(150*60+20*150*1.25+(time-80)*150*1.5);
		     }	
		}
	System.out.println(salary);
	scanner.close();
	}
}
