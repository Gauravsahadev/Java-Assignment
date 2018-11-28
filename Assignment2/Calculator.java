class Calculator{
	public static void main(String []args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		char op=args[2].charAt(0);

		switch(op){
			case '+':
				System.out.println("Sum: "+(a+b));
				break;
			case '-':
				System.out.println("Diff: "+(a-b));
				break;
			case '/':
				System.out.println("Divide: "+(a/b));
				break;
			case '*':
				System.out.println("Multiply: "+a*b);
				break;
			default:
				System.out.println("Invalid operator");
		}
	}
}