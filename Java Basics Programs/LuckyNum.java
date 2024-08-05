class LuckyNum
{
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if((a*b)%2==0)
			System.out.println("Lucky Number");
		else
			System.out.println(" Not a Lucky Number");
	}
}
			