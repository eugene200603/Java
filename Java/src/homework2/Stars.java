/*
 9.	迴圈敘述的練習-Stars
   畫出下列三種排列的星星圖形。

 (1)	    *         (2)  * * * * *    (3)     *
          	* *              * * * *           ***
          	* * *              * * *          *****
          	* * * *              * *         *******
          	* * * * *              *        *********

 */
package homework2;

public class Stars {
	public static void main(String[] args) {
//(1小)
		
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=j;i++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
//(1大)		
//		for(int j=1;j<=5;j++) {
//			for(int i=1;i<=j;i++) {
//			System.out.print("* ");
//		}
//			System.out.println();
//		}
//		
		System.out.println("---------------------------------------------------	");
//(2小)		
		for(int j=1;j<=5;j++) {
			
			for(int k=1;k<j;k++) {
				System.out.print(" ");
			}
			
			for(int i=5;i>=j;i--) {
			System.out.print("*");
			}
			System.out.println();
		}
		
//(2小反)		
//          for(int j=1;j<=5;j++) {
//			
//			
//			for(int i=5;i>=j;i--) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//(2反)		
		
//               for(int j=1;j<=5;j++) {
//			   
//			   for(int i=5;i>=j;i--) {
//			    System.out.print("* ");
//				}
//			   
//			   for(int k=1;k<j;k++) {
//			   System.out.print(" ");
//			   }
//			
//			    
//			     System.out.println();
//		       }
//		
//(2大)		
		
//		for(int j=1;j<=5;j++) {
//					
//		   for(int k=1;k<j;k++) {
//		   System.out.print("  ");
//		   }
//					
//		     for(int i=5;i>=j;i--) {
//		     System.out.print(" *");
//		     }
//		     System.out.println();
//		     }
		
		
		
			
		System.out.println("---------------------------------------------------	");
//(3反)
//		 for(int j=1;j<=5;j++) {
//			for(int k=1;k<j;k++) {
//				System.out.print(" ");
//			}
//			
//			for(int i=5;i>=j;i--) {
//			System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//(3)
		int n=1;
		   for(int j=1;j<=10;j+=2) {
			   n=1;
				 	  
			   for(int k=4;k>=(j/2);k--) {
				System.out.print(" ");
			   }
			   
				   for(int i=1;i<=j;i++) {
				   System.out.print("*");
				   n++;
			       }			   
			      			   
			  
			       if (n%2==0) {    
			       System.out.println();
			   }
		}
		
		
	}
}
