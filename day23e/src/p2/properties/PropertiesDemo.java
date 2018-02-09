package p2.properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		test();
		
	}
	
	public static void test() throws IOException{
		//读取这个文件。
		File file = new File("info.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		
		
		
		
		//创建集合存储配置信息。
		Properties prop = new Properties();
		
		//将流中信息存储到集合中。
		prop.load(fr);
		
		prop.setProperty("wangwu", "16");
		
		
		
		FileWriter fw = new FileWriter(file);
		
		prop.store(fw,"");
		
//		prop.list(System.out);
		
		fw.close();
		fr.close();
		
		
		
	}
	

}
