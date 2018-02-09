package p2.file.demo;

import java.io.File;

public class FileMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		renameToDemo();
	}
	
	public static void renameToDemo() {
		
		File f1 = new File("c:\\9.mp3");
		
		File f2 = new File("d:\\aa.mp3");
		
		boolean b = f1.renameTo(f2);
		
		System.out.println("b="+b);
	}

}
