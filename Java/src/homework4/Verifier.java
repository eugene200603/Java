//亂數練習-Verifier 
//產生四個數字的驗證碼。 
//產生四個數字的驗證碼且不重覆。 
//產生六個包含英文字母和數字的驗證碼

package homework4;
public class Verifier {
	
	static void ver1() {
		int verifier=(int)(Math.random()*10000);
		String ver=String.format("%04d", verifier);
		 System.out.println("四個數字驗證碼:"+ver);
	}
	
	static void ver2() {
		boolean check=true;
		int arr[]=new int[4];
		 System.out.print("四個不重複數字驗證碼:");
		for (int i=0;i<4;i++) {		
			arr[i]=(int)(Math.random()*9.999);
			
			 for(int j=0;j<i;j++) {				 
				  if(arr[i]==arr[j]) {
					  check=false;
					  break;
				}				
				  }
			   if(check==true) {				 
			  System.out.print(arr[i]);
			  }
			  else {
				  i--;
				  check=true;
			  }					   
			}
		System.out.println();
		}
	
	
	static void ver3() {
		int arr[]=new int[62];
		int num;
		for(int i=0;i<62;i++) {
			if(i<10) {
				arr[i]=i+48;
			}
			else if(i>9 && i<36) {
				arr[i]=i+55;
			}
			else {
				arr[i]=i+61;
			}
		}
		System.out.print("六個英文數字驗證碼:");
		 for (int j=0;j<8;j++) {
			 num=(int)(Math.random()*61.999999);
			 arr[j]=arr[num];
			 System.out.print((char)arr[j]);
		 }
		
	}
	public static void main(String[] args) {
ver1();
ver2();
ver3();
	}
}