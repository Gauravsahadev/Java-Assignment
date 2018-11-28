abstract class Loan{
	double loanamount,interestRate;
	int noOFYear;
	abstract void calculateInterest();
	void loan(double a,double b,int c){
		loanamount=a;
		interestRate=b;
		noOFYear=c;
	}

}
class EducationLoan extends Loan{

	EducationLoan(double a,double b,int c){
		super();
	}
	void calculateInterest(){
		double si=(loanamount*interestRate*noOFYear)/100;
		System.out.println("Simple Interest:"+si);
	}

}
class HomeLoan extends Loan{

	HomeLoan(double a,double b,int c){
		super();
	}
	void calculateInterest(){
		double si=(loanamount*(1+interestRate)*noOFYear);
		System.out.println("Compound Interest:"+si);
	}

}
class Main{
	public static void main(String[] args) {
		EducationLoan ob=new EducationLoan(10000,10,12);
		ob.calculateInterest();
		HomeLoan ob2=new HomeLoan(10000,10,12);
		ob2.calculateInterest();
	}
}