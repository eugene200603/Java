/*
選擇性敘述的練習-Electricity
電力公司使用累計方式來計算電費，分非營業用電及營業用電。
輸入何種用電和度數，計算出需繳之電費。(皆以非夏月來計算)
*/

package homework1;
import java.util.Scanner;
public class Electricity {
	public static void main(String[] args) {
		double electricity,nonbusiness,business;
		String answer;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("是否為營業用電? Y/N");
		answer= scanner.next();
		
	
		
		
	switch(answer) {
	 case "N" :	
		 
		 System.out.print("用電度數:");
		 electricity = scanner.nextDouble();
			
		if (electricity<=120){
			nonbusiness=electricity*1.63;
			System.out.print("非營業用電費:"+nonbusiness+"元"); 
			  }
		  else if(electricity<=330) {  
				nonbusiness=120*1.63+(electricity-120)*2.10;
				System.out.print("非營業用電費:"+nonbusiness+"元"); 
			  }
		  else if (electricity<=500) {
				nonbusiness=120*1.63+210*2.10+(electricity-330)*2.89;
				System.out.print("非營業用電費:"+nonbusiness+"元"); 
			  }
		  else if (electricity<=700) {		      
				 nonbusiness=120*1.63+210*2.10+170*2.89+(electricity-500)*3.94; 
				 System.out.print("非營業用電費:"+nonbusiness+"元"); 
			  }
		  	  
		  else if  (electricity<=1000) {			   
				   nonbusiness=120*1.63+210*2.10+170*2.89+200*3.94+(electricity-700)*4.60;
				   System.out.print("非營業用電費:"+nonbusiness+"元"); 
			   }
		
		  else {
			  nonbusiness=120*1.63+210*2.10+170*2.89+200*3.94+300*4.60+(electricity-1000)*5.03;
			  System.out.print("非營業用電費:"+nonbusiness+"元"); 
			     }
		  
		break;
		  
		    
	
	 case "Y" :
		 System.out.print("用電度數:");
		 electricity = scanner.nextDouble();
		 
		 
		 if (electricity<=330){
				business=electricity*2.12;
				System.out.print("營業用電費:"+business+"元"); 
				  }
			  else if(electricity<=700) {  
					business=330*2.12+(electricity-330)*2.91;
					System.out.print("營業用電費:"+business+"元"); 
			  }
			  else if(electricity<=1500) {  
					business=330*2.12+370*2.91+(electricity-700)*3.44;
					System.out.print("營業用電費:"+business+"元"); 
			  }
			  else  {  
					business=330*2.12+370*2.91+800*3.44+(electricity-1500)*5.05;
					System.out.print("營業用電費:"+business+"元"); 
			  }
		 
	   break;
	 default: 
		 System.out.print("輸入錯誤 請輸入Y/N");
		break; 
	}	 
	 	 
	scanner.close();	  
		}
			}

