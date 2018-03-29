package p3.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//1,创建读取字符数据的流对象。
				/*
				 * 在创建读取流对象时，必须要明确被读取的文件。一定要确定该文件是存在的。 
				 * 
				 * 用一个读取流关联一个已存在文件。 
				 */
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		
//		while((ch=fr.read())!=-1){
//			System.out.println((char)ch);
//		}
		
//		System.out.println((ch = fr.read()));
		
		//用Reader中的read方法读取字符。
		/*ch = fr.read();
		System.out.println(ch);
		int ch1 = fr.read();
		System.out.println(ch1);
		int ch2 = fr.read();
		System.out.println(ch2);*/
		
		while ((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fr.close();
		
	}

}






