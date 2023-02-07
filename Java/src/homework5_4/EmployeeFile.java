//4.	檔案和集合的練習-EmployeeFile
//改寫Employee作業，將hard code在程式裡的資料，改由檔案輸入。
//提示：
//a.	每一列資料代表一個員工所有的資料
//b.	檔案裡的每一列資料沒有特定順序
//c.	在檔案裡可增加一個職位別來表示不同的職位
//d.	使用String類別的split()將字串切成tokens
//e.	使用ArrayList取代陣列來存放資料


package homework5_4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class EmployeeFile {
	public static void main(String arg[]) {
try {
	File dir=new File("C:\\Java\\workspace\\file");
   dir.mkdir();
   File file=new File(dir,"Employee.txt");
   file.createNewFile();
   read();
  } catch(IOException e) {
		
     }  
	} 
   public static void write() throws IOException {
	 
   FileWriter fw = new FileWriter("C:\\Java\\workspace\\file\\Employee.txt");
   BufferedWriter bfw=new BufferedWriter (fw);
   
   bfw.write("3,\"CC\",\"F\",\"2020-03-01\",\"093333333\",\"eee@mail.com\",28000\n");
   bfw.write("2,\"BB\",\"M\",\"2020-02-01\",\"092222222\",\"www@mail.com\",25000\n");
   bfw.write("1,\"HH\",\"F\",\"2010-07-22\",\"093784513\",\"ghe@mail.com\",35000\n");
   bfw.write("4,\"DD\",\"F\",\"2020-04-01\",\"095555555\",\"qqq@mail.com\",50\n");
   bfw.write("1,\"AA\",\"M\",\"2020-01-01\",\"0912345678\",\"abc@mail.com\",30000\n");
   bfw.write("4,\"FF\",\"F\",\"2020-07-01\",\"095535545\",\"qoq@mail.com\",80\n");
   bfw.write("3,\"GG\",\"M\",\"2019-10-11\",\"092554822\",\"asw@mail.com\",27000\n");
   bfw.write("1,\"JJ\",\"F\",\"2000-11-11\",\"094751233\",\"egse@mail.com\",42000\n");
   bfw.write("2,\"II\",\"M\",\"2011-04-08\",\"0917814678\",\"fgc@mail.com\",32000\n");
   
   bfw.close();
   fw.close(); 
	
	
   }
   
   public static void read() {
	   
   try(
   FileReader fr=new FileReader("C:\\Java\\workspace\\file\\Employee.txt");
   BufferedReader br=new BufferedReader(fr);){
   String str;
   
   ArrayList<String> l=new ArrayList<String>();
   
   while((str=br.readLine())!=null) {
	   String[] split=str.split(",");
   	for (int i = 0; i < split.length; i++) {
   		String string=split[i];
			System.out.println(string);	
			
   	}
   
   }  
   	
  }
    catch(IOException e){
    	
    }
  
   
   } 

}