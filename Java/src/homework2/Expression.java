/*
 1.	迴圏的練習-Expression
利用for迴圏計算12-22+32-42+…+492-502的值。
 */


package homework2;

public class Expression {

	public static void main(String[] args) {
		int i=1;
		int j=2;
		int sum=0;
		for(i=1;i<=49;i+=2) { 
			sum=sum+i*i;			   
		}
		for(j=2;j<=50;j+=2) {
			sum=sum-j*j;
		}
		System.out.println(sum);
		
	}

}
