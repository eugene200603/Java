/*
4.	迴圏的練習-Amstrong
Amstrong數是指一個三位數的整數，其各位數之立方和等於該數本身。
找出所有的Amstrong數。
說明：153=13+53+33，故153為Amstrong數。
*/
package homework2;

public class Amstrong {
	public static void main(String[] args) {
		
	  
	  
	  for(int i=100;i<1000;i++) {
		  
		  
		  if((double)i== ( Math.pow(i/100, 3))+(Math.pow((i%100)/10, 3))+(Math.pow(i%10, 3)) ) {
			  System.out.print(i+" ");
		  }
			  
	  }
	  
	  System.out.print("為Amstrong數");
		
		
	}
}
