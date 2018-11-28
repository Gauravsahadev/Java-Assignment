class SI{
	String name;
	int principal,rate,time;

	void setInfo(String n,int p,int r,int t){
		name=n;
		principal=p;
		rate=r;
		time=t;
	}

	void showInfo(){
		int si=(principal*rate*time)/100;
		System.out.println("Name: "+name+" SI: "+si);
	}

	public static void main(String[] args) {
		SI ob=new SI();
		ob.setInfo(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		ob.showInfo();
	}
}