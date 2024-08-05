class LeapYear
{
	public static void main(String[]args)
	{
		int n;
		n=Integer.parseInt(args[0]);
		if(n % 4 == 0)
			System.out.println("It is leap year");
		else
			System.out.println("It is not leap year");
	}
}