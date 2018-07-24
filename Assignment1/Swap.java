class Swap{
	public static void main(String []args){
	int a,b;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	b=b+a;
	a=b-a;
	b=b-a;
	System.out.println(a+" "+b);
	}
}
