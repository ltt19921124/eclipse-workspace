package reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import bean.person.Person;

public class ReflectDemo4 {

	public ReflectDemo4() {
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		getMethodDemo_2();
//		getMethodDemo();
		
	}
	
	

	public static void getMethodDemo_3() throws Exception {
		
		Class clazz = Class.forName("bean.person.Person");
		
		Method methods = clazz.getMethod("paramMethod", String.class,int.class);
		
		
		
	}
	//
	public static void getMethodDemo_2() throws Exception {
		
		Class clazz = Class.forName("bean.person.Person");
		
		Method method = clazz.getMethod("show", null);//
//		Object obj = new Object();
//		method.invoke(obj, null);
//		Object obj = clazz.newInstance();
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		Object obj = constructor.newInstance("xiaoming",37);
		
		
		method.invoke(obj, null);
		
		
		
	}

	/*
	 * 
	 */
	public static void getMethodDemo() throws Exception {
		
		Class clazz = Class.forName("bean.person.Person");
		
		Method[] methods  = clazz.getMethods();//
		methods = clazz.getDeclaredMethods();//
		for(Method method : methods){
			System.out.println(method);
		}
		
		
	}

}
