class Rectangle{

	double length,width;
	double area;

	Rectangle(){
		length=width=0;
	}

	Rectangle(double l,double w){
		length=l;
		width=w;
	}

	public void calculate(){
		area=length*width;
	}

	public void display(){
		System.out.println("Area: "+area);
	}

}

class Main{
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.calculate();
		r.display();
	}
}