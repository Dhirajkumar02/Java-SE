class CheckAlphabet
{
	public static void main(String[]args)
	{
		char ch=args[0].charAt(0);
		if(ch >=65 && ch<=90)
			System.out.println("It is alphabet");
		else if(ch>=97 && ch<=122)
			System.out.println("It is alphabet");
		else
			System.out.println("It is not alphabet");
	}
}
			