/*
選擇性敘述的練習-Equation
一元二次方程式ax2+bx+c=0。輸入a, b, c三值，並計算方程式的根。
b2-4ac > 0，有兩個不相等的實根。
b2-4ac = 0，有兩個相等的實根。
b2-4ac < 0，則印出”沒有實根”。
*/

package homework1;
import java.util.Scanner;
public class Equation {
	public static void main(String[] args) {
		double a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a:");
		a = scanner.nextInt();
		System.out.println("b:");
		b = scanner.nextInt();
		System.out.println("c:");
		c = scanner.nextInt();
		
		if(Math.pow(b,2)-4*a*c==0) {
			System.out.println((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
		}	
			else {
				if (Math.pow(b,2)-4*a*c>0) {
					System.out.println((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
				    System.out.println((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
				}
				else {
					System.out.println("沒有實根");
				}
			}
		
scanner.close();
		
	}
}
