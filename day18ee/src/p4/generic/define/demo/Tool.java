package p4.generic.define.demo;

/*
public class Tool {

	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
*/


public class Tool<QQ>{
	private QQ q;

	public QQ getObject() {
		return q;
	}

	public void setObject(QQ object) {
		this.q = object;
	}
	
	
	public <W> void show(W str){
		System.out.println("show : "+str.toString());
	}
	public void print(QQ str){
		System.out.println("print : "+str);
	}
	
	/**
	 *
	 * @param obj
	 */
	public static <Y> void method(Y obj){
		System.out.println("method:"+obj);
	}
}
