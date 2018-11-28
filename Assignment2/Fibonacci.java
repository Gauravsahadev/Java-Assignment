import java.util.Scanner;

class Fibonacci{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=0;i<num-2;i++){
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}

	}

}