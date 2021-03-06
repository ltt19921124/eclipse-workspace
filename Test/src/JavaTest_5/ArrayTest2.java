package JavaTest_5;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toHex_2(78);
		
	}
	
	public static void toHex_2(int num)
	{

		if(num==0)
		{
			System.out.println("0");
			return ;
		}
		//定义一个对应关系表。
		char[] chs = {'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F'};
		/*
		一会查表会查到比较的数据。
		数据一多，就先存储起来，在进行操作。
		所以定义一个数组。 临时容器。
		*/
		char[] arr = new char[8];
		int pos = arr.length;

		while(num!=0)
		{
			int temp = num&15;
			arr[--pos] = chs[temp];
			num  = num >>> 4;
		}

		System.out.println("pos="+pos);
		for(int x=pos ;x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}


	}
	
	public static void toHex_1(int num)
	{
		//定义一个对应关系表。
		char[] chs = {'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F'};
		
		for(int x=0 ; x<8; x++)
		{
			int temp = num & 15;
			System.out.print(chs[temp]);
			num = num >>> 4;
		}

	}
	
	public static void toHex(int num)
	{

		for(int x=0; x<8; x++)
		{
			int temp = num & 15;
			if(temp>9)
				System.out.print((char)(temp-10+'A'));
			else
				System.out.print(temp);
			num = num >>> 4;
		}
		/*
		int n1 = num & 15;
		System.out.println("n1="+n1);

		num = num >>> 4;
		int n2 = num & 15;
		System.out.println("n2="+n2);
		*/
	}
}
