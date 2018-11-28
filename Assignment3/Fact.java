class Fact{
	
	static int fact(int num){
		if (num==0)
			return 1;
		else
			return num*fact(num-1);
	}
	
	public static void main(String []args){
		//Fact ob=new Fact();
		//System.out.println(ob.fact(Integer.parseInt(args[0])));
		int res=Fact.fact(3);
		System.out.println("Result: "+res);	
	}
}
