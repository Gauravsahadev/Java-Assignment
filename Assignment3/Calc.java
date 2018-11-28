import java.util.Scanner;

class Marks{

	static void calc(int n){

		if(n>=90)
			System.out.println("Outstanding");
		else if(n>=80 && n<90)
			System.out.println("Excellent");
		else if(n>=70 && n<80)
			System.out.println("Very Good");
		else if(n>=60 && n<70)
			System.out.println("Good");
		else
			System.out.println("Average");
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Marks.calc(n);

	}

}