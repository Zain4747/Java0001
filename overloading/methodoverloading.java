package overloading;

public class methodoverloading {
	
	
	
	void add (int a, int b)
	{
	System.out.println(a+b);
	}
	
	void add (int a, double b)
	{
	System.out.println(a+b);
	}
	
	void add (double a, double b)
	{
	System.out.println(a+b);
	}
	
	void add (int a, int b, int c)
	{
	System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		methodoverloading mo=new methodoverloading();
		mo.add(10, 20);
		mo.add(10, 20.0);
		mo.add(10.0, 20.0);
		mo.add(10, 20, 30);

	}

}
