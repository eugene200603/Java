/*
7.	迴圏的練習-Rabbit
老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。
*/

package homework2;

public class Rabbit {
	public static void main(String[] args) {
		int rabbit=1;
		
		while(rabbit>0) {
		    if(rabbit%3==1 && rabbit%5==3 && rabbit%7==2) {
			break;
		    }
		    rabbit++;   
	    }
		System.out.println(rabbit);
		
	}	
}
