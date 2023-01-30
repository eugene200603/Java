//亂數的練習-IDGenerator 
//輸入地區和性別，經由亂數產生一個身份証字號。

package homework4;
 import java.util.Scanner;
public class IDGenerator {
	   
	 static void ID() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("請輸入地區");
		 String area=sc.next();
		 System.out.println("請輸入性別");
		 String sex=sc.next();
		 sc.close();
	 }
	
	public static void main(String[] args) {
		

	}

}
