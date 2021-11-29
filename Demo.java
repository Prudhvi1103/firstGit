class Demo 
{
	int a;
	public Demo(int  a)
	{
		System.out.println("Inside constructor with int arg a : "+a);
	}
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(5);
		Demo d2 = new Demo(55);
		Demo d3 = new Demo(555);
		Demo d4 = new Demo(5555);
		
	}
}
