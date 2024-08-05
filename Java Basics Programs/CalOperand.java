class CalOperand
{
	public static void main(String[]args)
	{
		int a, b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[2]);
		char ch=args[1].charAt(0);
		if(ch=='+')
			System.out.println("Addition is " +(a+b));
		else if(ch=='-')
			System.out.println("Substraction is " +(a-b));
		else if(ch=='*')
			System.out.println("Multiplication is " +(a*b));
		else if(ch=='/')
			System.out.println("Division is " +(a/b)); 
		else if(ch=='%')
			System.out.println("Remainder is " +(a%b));
	}
}

	