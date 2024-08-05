class Insurance
{
	public static void main(String[]args)
	{
		int age;
		age=Integer.parseInt(args[0]);
		String gender, status;
		gender=args[1];
		status=args[2];
		if(status.equalsIgnoreCase("Married"))
			System.out.println("Insurance Given");
		else if(gender.equalsIgnoreCase("Male") && age>35)
			System.out.println("Insurance Given");
		else if(gender.equalsIgnoreCase("Female") && age>30)
			System.out.println("Insurance Given");
		else
			System.out.println("Insurance not Given");
	}
}
			
		
		