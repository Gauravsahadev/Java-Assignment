class Emp{
	String name;
	int age,salary;
	String gender;
	void setInfo(String n,int a,int s,String g){
		name=n;
		age=a;
		salary=s;
		gender=g;
	}
	void showInfo(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Gender: "+gender);
	}
	public static void main(String []args){
		Emp ob=new Emp();
		ob.setInfo(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),args[3]);
		ob.showInfo();
	}
}