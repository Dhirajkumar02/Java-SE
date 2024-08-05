 class PrintAbsolute {
	public static void main(String args[]){
	int a, b;
	a=Integer.parseInt(args[0]);
	b=(a>=0)?a:-a;
	System.out.println("Absolute value is " +b);
	}
}