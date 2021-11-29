class Car 
{
	public String series;
	public String color;
   public int speed;
   public int time;
   public static String brand = "AADI";
    
	public Car(String p, String q, int r, int s)
	{
		series = p;
		color = q;
		speed = r;
		time = s;

	}
	public void findDistance()
	{
      int distance = speed*time;
 System.out.println(color+" color "+brand+" series "+series+" moving @ the speed of "+speed+" km/h for "+time+" hours has covered a distance is "+distance);
  System.out.println();
	}
	public static void main(String[] args) 
	{
		Car c1 = new Car("A4","RED",240,2);
		Car c2 = new Car("A1","BLUE",320,4);
        c1.findDistance();
			c2.findDistance();
	}
}
