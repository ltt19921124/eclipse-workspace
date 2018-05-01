package reflect.demo;

import java.lang.reflect.Field;
import java.util.HashMap;


public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		getFieldDemo();
//		HashMap hs = new HashMap();
		
	}
	
	public static void getFieldDemo() throws Exception {
		
		Class clazz = Class.forName("bean.person.Person");
		
		Field field = null;//clazz.getField("age");//只能获取公有的，
		
		field = clazz.getDeclaredField("age");//只获取本类，但包含私有。 
		
		//对私有字段的访问取消权限检查。暴力访问。
		field.setAccessible(true);
		
		Object obj = clazz.newInstance();
		
		field.set(obj, 89);
		
		
		Object o = field.get(obj);
		
		System.out.println(o);
		
//		cn.itcast.bean.Person p = new cn.itcast.bean.Person();
//		p.age = 30;
		
	}

}
