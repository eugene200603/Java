/*
 6.	迴圏的練習-Rope
若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。

 */

package homework2;

public class Rope {
	public static void main(String[] args) {
		
		int rope=3000;
		int i=0;
		
	while(rope>=5) {
		
		rope=rope/2;
		
		
		i++;
	}
	
		System.out.print(i+"天");
		
		
	}
}
