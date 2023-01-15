//2.	二維陣列的練習-Sales
//某一公司有五種產品A、B、C、D與E，其單價分別為12、16、10、14與15元；而該公司共有三位銷售員，他們在某月份的銷售數量如下所示
//
//銷售員	產品A	產品B	產品C	產品D	產品E
//Jean	33	32	56	45	33
//Tom	77	33	68	45	23
//Tina	43	55	43	67	65
//試計算：
//a.	每一個銷售員的銷售總金額
//b.	有最好業績（銷售總金額最多者）的銷售員
//c.	每一項產品的銷售總金額
//d.	銷售總金額最多的產品

 package homework3;
import java.util.Arrays;

public class Sales {
	public static void main(String[] args) {

	int[][]a= {{33,32,56,45,33},         //數量
			   {77,33,68,45,23},
			   {43,55,43,67,65}};
	
	int[][]b=Arrays.copyOf(a,a.length);  //售價
	
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++) {
			  if(j==0) {
			  b[i][j]=b[i][j]*12;
		      }
		      else if(j==1){
			  b[i][j]=b[i][j]*16;
		      }
		      else if(j==2) {
		      b[i][j]=b[i][j]*10;  
		      }
		      else if(j==3) {
		      b[i][j]=b[i][j]*14;   
		      }
		      else if(j==4) {
			  b[i][j]=b[i][j]*15;   
			  }
		}
		}
	
		 int jeansum=0;
		 int tomsum=0;
		 int tinasum=0;

	
//(1)	每一個銷售員的銷售總金額
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
		     if(i==0) {
		    	 jeansum+=b[i][j];
		     }
		     else if(i==1){
		    	 tomsum+=b[i][j];
		     }
		     else if(i==2){
		    	 tinasum+=b[i][j];
		     }
			
          }
		}
		System.out.println("Jean銷售總金額"+jeansum+"元");
		System.out.println("Tom銷售總金額"+tomsum+"元");
		System.out.println("Tina銷售總金額"+tinasum+"元");

//(2)有最好業績（銷售總金額最多者）的銷售員
		
		String winner="Jean";
		
		if(jeansum>tomsum && jeansum>tinasum) {
			winner="Jean";
		}
		else if(tomsum>jeansum && tomsum>tinasum) {
			winner="Tom";
		}	
		else if(tinasum>tomsum && tinasum>jeansum) {
			winner="Tina";
		}
	System.out.println("有最好業績（銷售總金額最多者）的銷售員是"+winner);
	
	
//(3)每一項產品的銷售總金額
	int A=0,B=0,C=0,D=0,E=0;
	for(int i=0;i<b.length;i++) {	
		for(int j=0;j<b[i].length;j++) {	
			
			if(j==0) {
				  A+=b[i][j];
			      }
			      else if(j==1){
				  B+=b[i][j];
			      }
			      else if(j==2) {
			      C+=b[i][j];  
			      }
			      else if(j==3) {
			      D+=b[i][j];   
			      }
			      else if(j==4) {
				  E+=b[i][j];   
				  }
	    }	
			
	}
	
	System.out.println("A產品的銷售總金額:"+A+"元") ;
	System.out.println("B產品的銷售總金額:"+B+"元") ;  
	System.out.println("C產品的銷售總金額:"+C+"元") ;  
	System.out.println("D產品的銷售總金額:"+D+"元") ;  
	System.out.println("E產品的銷售總金額:"+E+"元") ;  
	
//(4)銷售總金額最多的產品
	
	String max="A";
	 if(A>B && A>C && A>D && A>E) {		 
		     max="A產品";				
	 }
	 else if(B>A && B>C && B>D && B>E) {
		 max="B產品";
	 }
	 else if(C>A && C>B && C>D && C>E) {
		 max="C產品";
	 }
	 else if(D>A && D>B && D>C && D>E) {
		 max="D產品";
	 }
	 else if(E>A && E>B && E>C && E>D) {
		 max="E產品";
	 }
	
	 System.out.println("銷售總金額最多的產品是"+max);
	
	
	
	
	
	}
}









