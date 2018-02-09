package p2.file.demo;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorDemo();
		
	}
	
	public static void constructorDemo() {
		
		//可以将一个已存在的，或者不存在的文件或者目录封装成file对象。
		File f1 = new File("c:\\a.txt");
		
		File f2 = new File("c:\\","a.txt");
		
		File f = new File("c:\\");
		
		File f3 = new File(f,"a.txt");
		
		File f4 = new File("c:"+File.separator+"abc"+
				File.separator+"a.txt");
		System.out.println(f4);
		
		
	}

}
