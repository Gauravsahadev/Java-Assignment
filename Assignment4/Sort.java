import java.util.Scanner;
class Sort{
	
	public void sort(int array[]){
		for(int i=0;i<array.length-1;i++){
			for (int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

	public void show(int array[]){
		System.out.print("Sorted: ");
		for(int i=0;i<array.length-1;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println("");
	}

	public void reverse(int array[]){
		System.out.print("Reverse: ");
		for(int i=array.length-1;i>=0;i--){
			System.out.print(array[i]+"\t");
		}
	}	
}

class Main{
	public static void main(String[] args) {
		Sort ob=new Sort();
		int array[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			array[i]=sc.nextInt();
		}
		ob.sort(array);
		ob.show(array);
		ob.reverse(array);
	}
}