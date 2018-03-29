package p2.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw = null;
		try {

			fw = new FileWriter("demo11.txt");

			fw.write("abcde" + LINE_SEPARATOR + "hahaha");

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// code....
					throw new RuntimeException("关闭失败");
				}
		}
		
	}

}




