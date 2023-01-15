



// 1. Write the java program to design method for addition of two number which returns,
//    int results to that method and result should be print into main method.




public class Addition {

	@SuppressWarnings("unused")
	public void add()
	{
		int a = 10;
		
		System.out.println("Number one : " + a);
		
		int b = 20;
		
		System.out.println("Number Two :" + b);
		
		int c = a+b;
		
		System.out.println("Addition of Two Numbers : " + c);
		
	}
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
           Addition obj = new Addition();
           obj.add();
           
	}

}
