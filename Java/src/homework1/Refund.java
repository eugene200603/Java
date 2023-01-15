/*
選擇性敘述的練習-Refund
輸入在某商店購物應付金額與實付金額。
實付金額小於應付金額，則印出”金額不足”。
實付金額等於應付金額，則印出”不必找錢”。
實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
說明：若買了132元的商品，付1000元，應找回一張500元，三張100元，一個50元硬幣，一個10元硬幣，一個5元硬幣和三個1元硬幣。
 */

package homework1;
import java.util.Scanner;
public class Refund {
	public static void main(String[] args) {
		int price,fund,refund;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("應付金額:");
		price = scanner.nextInt();
		System.out.println("實付金額:");
		fund = scanner.nextInt();
		
		refund=fund-price;	
		
		if (fund==price) {
			System.out.println("不必找錢");
		}	
			else {				
		        if(fund<price) {					
		          System.out.println("金額不足");
		         }  
		        else {
		        	 System.out.println(refund);
		        	  System.out.print("找回1000元"+(refund/1000)+"張 "+
		        			  "找回500元"+((refund%1000)/500)+"張 "+
		        			  "找回100元"+((refund%500)/100)+"張 " +
		        			  "找回50元"+((refund%100)/50)+"個 " +
		        			  "找回10元"+((refund%50)/10)+"個 "+
		        			  "找回5元"+((refund%10)/5)+"個 "+
		        			  "找回1元"+((refund%5)+"個"));	
		          }
					
			}	
		
		
		scanner.close();
			
	}
}
