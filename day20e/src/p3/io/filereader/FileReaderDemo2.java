package p3.io.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("demo_1.txt");
		
		/*
		 * 使用read(char[])读取文本文件数据。
		 *  
		 * 先创建字符数组。
		 */
		char[] buf = new char[1024];
		
		int len = 0;
		
		while((len=fr.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
		}
		

		fr.close();
		
	}

}






