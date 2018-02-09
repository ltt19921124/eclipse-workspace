package p6.io.charstream.linenumber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("demo.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		lnr.setLineNumber(100);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		
		lnr.close();
		
	}

}




