package p2.io.charstream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterDemo {
	private static final String LINE_SEPARATOR = 
			System.getProperty("line.separator");
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("buf.txt");
		
		
		//为了提高写入的效率。使用了字符流的缓冲区。
		//创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
		BufferedWriter bufw = new BufferedWriter(fw);
		
		for(int x=1; x<=4; x++){
			bufw.write("abcdef"+x);
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		
		
	}

}




