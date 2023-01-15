//1.	一維陣列的練習-MaxMin
//事先將10個數字置於一維陣列中，分別找出10個數字中最大的值和最小的值。

package homework3;

public class MaxMin {

	
	
	public static void main(String[] args) {
		
		
		int[] a= {3,5,99,35,7,4,1,42,63,12};
		int x=a[0];
		int y=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			    if(a[i]>=x) {
				x=a[i];
			    }
		}		
		       
		   for(int j=0;j<a.length;j++)	{	
		        
				  if(y>a[j]) {
				  y=a[j];					
				  } 
				
			    }
	
		System.out.println("最大值:"+x);
		System.out.println("最小值:"+y);
	}

}
