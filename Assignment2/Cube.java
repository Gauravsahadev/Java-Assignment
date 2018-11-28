class Cube{
	public static void main(String []args){
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<=num;i++){
			int cube=i*i*i;

			System.out.println("Cube of "+i+" is : "+cube);
		}
	}
}