package p1.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("demo.txt");
		FileWriter fw = new FileWriter("demoto.txt");
//		//频繁的读写操作
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fw.close();
		fr.close();
		
	}

}
