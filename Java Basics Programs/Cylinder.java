class Cylinder
{
	public static void main(String[]args)
	{
		int r=Integer.parseInt(args[0]);
		int h=Integer.parseInt(args[1]);
		double area=((2*Math.PI*r*h) + (2*Math.PI*Math.pow(r,2)));
		System.out.println("Area of Cylinder is " +area);
	}
}