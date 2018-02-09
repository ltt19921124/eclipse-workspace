package p7.io.bytestream.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void copy_1() throws IOException {
		
		FileInputStream fis = new FileInputStream("c:\\0.mp3");		
		FileOutputStream fos = new FileOutputStream("c:\\1.mp3");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=fis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		fis.close();
	}

}
