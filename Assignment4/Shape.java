class Shape{

	double volume;

	public void calculate(float l,float b,float h){
		volume=l*b*h;
	}

	public void calculate(float r){
		volume=(4*3.14*r*r*r)/3.0;
	}

	public void calculate(float r,float h){
		volume=(3.14*r*r*h)/3.0;
	}

	public void show(){
		System.out.println("Display: "+volume);
	}
}

class Main{
	public static void main(String[] args) {
		Shape ob =new Shape();
		ob.calculate(4);
		ob.show();
		ob.calculate(4,5,6);
		ob.show();
	}
}