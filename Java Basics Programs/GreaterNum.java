class GreaterNum
{
	public static void main (String [] args)
	{
		int a, b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		if(a==b)
			System.out.println("Both are equals");
		else if(a>b)
			System.out.println(a +" is Greater");
		else
			System.out.println(b +" is Greater");
	}
}