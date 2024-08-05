class UseString3
{
	public static void main (String[]args)
	{
		String city1=new String ("Bhopal");
		String city2=new String ("Bhopal");
		String city3=new String ("bhopal");
		System.out.println("city1 is " +city1);
		System.out.println("city2 is " +city2);
		System.out.println("city3 is " +city3);
		System.out.println(city1.equals(city2));
		System.out.println(city1.equals(city3));
	}
}