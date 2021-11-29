class Rectangle 
{
	public int l;
	public double w;

	public Rectangle(int a,double b)
	{
      l  = a;
	  w  = b;
	}
	  public void printArea()
	{
		  double area = l*w;
		  System.out.println("Rectangle of dimensions "+l+" X "+w+" is "+area);
		  System.out.println();
	}
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(5,1.2);
        Rectangle r2 = new Rectangle(8,3.4);
		r1.printArea();
			r2.printArea();
	}
}
