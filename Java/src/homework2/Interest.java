/*
10.	迴圈敘述的練習-Interest
錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
提示：單利公式：P(1+r*n)    複利公式：P(1+r)n
P：本金，r：利率，n：多少年
*/
package homework2;

public class Interest {

	public static void main(String[] args) {
		
		double x=0,y=0; //x:錢精打 y:郝細算
		double p1=100000,p2=100000; //本金
		double r1=0.1,r2=0.05; //利率
		int n=1; //年
		
		
		while(n>0) {
			
			x=(p1)*(1+(r1)*n);
			
			y=(p2)*Math.pow((1+(r2)),n);
			
			
			if(y>x) {
				break;
			}
			
			n++;
			
		}
		        System.out.println("錢精打的錢有"+x+"元");
		        System.out.println("郝細算的錢有"+y+"元");
				System.out.println("經過"+n+"年,郝細算的錢超過錢精打");
				

	}

}
