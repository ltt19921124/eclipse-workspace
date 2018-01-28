package p2.linkedlist.test;



public class LinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()){
			System.out.println(dl.myGet());
		}
		
		
	}

}
