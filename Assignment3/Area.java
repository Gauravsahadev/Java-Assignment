class Area{

	float breath,height;
	
	Area(float b,float h){
		breath=b;
		height=h;
		float area=(breath*height)/2;
		System.out.println("Area: "+area);
	}

	public static void main(String[] args) {
		Area ob=new Area(Float.parseFloat(args[0]),Float.parseFloat(args[1]));
	}
}