//1.	例外處理的練習-Stack
//產生一個class名為Stack，有兩個成員變數分別為一int陣列(用以存放資料)和top(int) (用以標示目前最上層資料的註標值)；
//有兩個成員方法push()和pop()，分別用來放資料和取資料。
//產生兩個exception class名為StackEmptyException和StackFullException，分別用來處理Stack空的和滿的狀況。
//提示：Stack以先進後出(First In Last Out)的方式存取資料。


package homework5_3;

public class Stack {
int[] deposit=new int[3];
int top=-1;

      public void push(int i) throws  StackFullException{   	
    	             top++ ; 
    	            
    	            if (top>=3) {
    	    		throw new StackFullException();
    	    	}   	
    	       deposit[top]=i;
    	       
    	        
    	         
    	       System.out.println("放入第"+(top+1)+"層:"+i);    	    	 	
    	  }
      
      public void pop() throws  StackEmptyException{
    	        
    	  
    	        if (top<0) {
	    		throw new StackEmptyException();
	    		}
    	      deposit[top]=-1;   
    	      top--;
    	     	   
    	      
    	      
    	  System.out.println("第"+(top+2)+"層拿掉");
     	 	    	
      }
}  	  
    	
    	
       
