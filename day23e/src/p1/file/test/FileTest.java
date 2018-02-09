package p1.file.test;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("e:\\demodir");
		
		listAll(dir,0);
		
	}
	
	public static void listAll(File dir,int level) {
		
		
		System.out.println(getSpace(level)+dir.getName());
		//获取指定目录下当前的所有文件夹或者文件对象
		
		level++;
		File[] files = dir.listFiles();
		
		for(int x=0; x<files.length; x++){
			
			if(files[x].isDirectory()){
				listAll(files[x],level);
			}
			else
				System.out.println(getSpace(level)+files[x].getName());
		}	
	}
	
	private static String getSpace(int level) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("|--");
		for(int x=0; x<level; x++){
			sb.insert(0,"|  ");
		}
		
		return sb.toString();
	}

}
