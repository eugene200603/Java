/*
 3.	迴圏的練習-PerfectNumber
一個數字若等於其所有因數的總和，則此數為perfect number。
找出100以內所有的完美數。
說明：6的因數為1, 2, 3，6=1+2+3，故6為完美數。

 */

package homework2;

public class PerfectNumber {
	public static void main(String[] args) {
		
int sum=0;		
		
	for(int j=1;j<100;j++) {
		sum=0;
		for(int i =1;i<j;i++) {
			
			if(j%i==0) {
				sum+=i;
				continue;
			}
		}
	
	        if(sum==j) {
	    	 System.out.print(sum+"  ");
	        }
	    		 
	}
	System.out.println("為完美數");
	  
	}
}