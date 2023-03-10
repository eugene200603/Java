//3.	三維陣列的練習-Rain
//輸入一字串，字串為”all” 表示計算60個月的總平均降雨量，”year”、”season”和”month”分別表示計算某年、某季或某月的平均降雨量。若為後三者，再輸入一個正整數表示那一年、那一季或那一月。
//說明：5年12個月的降雨量以三維陣列形式事先給好60個浮點數
//需做誤錯處理：
//a.	輸入除了”all”、”year”、”season”和”month”以外的字串
//b.	若輸入”year”，而正整數輸入1至5以外的數字
//c.	若輸入”season”，而正整數輸入1至4以外的數字
//d.	若輸入”month”，而正整數輸入1至12以外的數字


package homework3;
import java.util.Scanner;
public class Rain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
//	  double[][][] rain={{{1,2,3},
//				                        {4,5,6},
//				                        {7,8,9},
//				                        {10,11,12}},
//			                         	{{1,2,3},
//                                        {4,5,6},
//                                        {7,8,9},
//                                        {10,11,12}},
//			                           {{1,2,3},
//    				                    {4,5,6},
//    				                    {7,8,9},
//    				                    {10,11,12}},
//			                           {{1,2,3},
//    				                    {4,5,6},
//    				                    {7,8,9},
//    				                    {10,11,12}},
//			                           {{1,2,3},
//    					                 {4,5,6},
//    					                 {7,8,9},
//    					                 {10,11,12}}};
	  
	  double[][][] rain={{{1,2,1},{1,3,1},{4,1,1},{1,1,6}},
       	                              {{5,1,1},{2,2,1},{3,1,6},{4,8,1}},
                                      {{4,3,1},{5,2,4},{7,1,4},{1,5,2}},
                                      {{5,1,4},{7,2,1},{4,1,6},{8,6,1}},
                                      {{1,3,5},{8,1,6},{2,4,1},{1,9,1}}};
                                     
	  
	  System.out.println("請輸入查詢類型(all,year,season,month):");
	    String x=sc.next();
	    double sum=0;
	    int count=0;


switch(x) {
	case "all":  	    
		 for(double[][] l:rain) {                              //for-each
		     for(double[] m:l) {
		    	 for(double n:m) {
		            sum+=n;	    	
		            count++;		         
	
//	    for(int i=0;i<rain.length;i++) {                                 //傳統for
//	    	for(int j=0;j<rain[i].length;j++) {
//	    		for(int k=0;k<rain[i][j].length;k++) {
//   		    sum+=rain[i][j][k];	    	
//	    			  count++;
	    			  }    	 
	             }
	         }	  
	    System.out.print("總平均降雨量:"+sum/count+"mm");
	    break;
	   case "year":
		   System.out.println("請輸入1~5");
		   int y=sc.nextInt();
		    if(y>=1 && y<=5) {
		    	for(int i=0;i<rain.length;i++) {                                
			    	for(int j=0;j<rain[i].length;j++) {
			    		for(int k=0;k<rain[i][j].length;k++) {
		    	       sum+=rain[y-1][j][k];
		    	       count++;
			    		}
			    	}
		    	}
		    	System.out.print("第"+y+"年平均降雨量:"+sum/count+"mm");
	    		break ;
		    }
		    else {
		    	System.out.println("輸入錯誤");
		    	break ;
		    }
	   case "season":
		     System.out.println("請輸入1~4");
		     int s=sc.nextInt();
		       if(s>=1 && s<=4) {
		    	for(int i=0;i<rain.length;i++) {                                
			    	for(int j=0;j<rain[i].length;j++) {
			    		for(int k=0;k<rain[i][j].length;k++) {
		    	       sum+=rain[i][s-1][k];
		    	       count++;
			    		}
			    	}
		    	} 	
		    	System.out.print("第"+s+"季平均降雨量:"+sum/count+"mm");
	    		break ;
	    		}
		       else {
			    	System.out.println("輸入錯誤");
			    	break ;
			    }
	    			
	   case "month":
		   System.out.println("請輸入1~12");
		     int m=sc.nextInt();
		       if(m>=1 && m<=12) {
		    	for(int i=0;i<rain.length;i++) {                                
			    			switch(m) {
			    			case 1:
			    				 sum+=rain[i][0][0];
					    	       count++;
					    	       break;
			    			case 2:      
			    				sum+=rain[i][0][1];
					    	       count++;
					    	       break;
			    			case 3:
			    				sum+=rain[i][0][2];
					    	       count++;
					    	       break;
			    			case 4:
			    				sum+=rain[i][1][0];
					    	       count++;
					    	       break;
			    			case 5:
			    				sum+=rain[i][1][1];
					    	       count++;
					    	       break;
			    			case 6:
			    				sum+=rain[i][1][2];
					    	       count++;
					    	       break;
			    			case 7:
			    				sum+=rain[i][2][0];
					    	       count++;
					    	       break;
			    			case 8:
			    				sum+=rain[i][2][1];
					    	       count++;
					    	       break;
			    			case 9:
			    				sum+=rain[i][2][2];
					    	       count++;
					    	       break;
			    			case 10:
			    				sum+=rain[i][3][0];
					    	       count++;
					    	       break;
			    			case 11:
			    				sum+=rain[i][3][1];
					    	       count++;
					    	       break;
			    			case 12:
			    				sum+=rain[i][3][2];
					    	       count++;
					    	       break;
			    			}
		    	
		    	} 	
		    	System.out.print(m+"月平均降雨量:"+sum/count+"mm");
	    		break ;
	    		}
		       else {
			    	System.out.println("輸入錯誤");
			    	break ;
			    }
	    		 default:
	    			 System.out.println("輸入錯誤");
	    			 break ;
	    			}   
	    			                       
	  sc.close(); 
	}

}
