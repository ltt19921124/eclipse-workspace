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
		while ((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fr.close();
		
	}

}






