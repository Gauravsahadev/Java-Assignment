class StudentTest{
	int chemistry,math;
	int rollnumber;

	void getRoll(int a){
		rollnumber=a;
	}

	void getMarks(int a1,int b1){
		chemistry=a1;
		math=b1;
	}

	void showMarks(){
		System.out.println("chemistry: "+chemistry);
		System.out.println("Maths: "+math);
	}
	void showRoll(){
		System.out.println("rollnumber: "+rollnumber);
	}

}
interface Sports{
		float sportW=8.0f;
		abstract void displayWt();
}
class Result extends StudentTest implements Sports{
		public void displayWt(){
			System.out.println("The Result::"+sportW);
		}
		void displayResult(){
			showMarks();
			displayWt();
			showRoll();
		}
}
class Main{
	public static void main(String[] args) {
		Result ob=new Result();
		ob.getRoll(56);
		ob.getMarks(12,13);
		ob.displayResult();
	}
}