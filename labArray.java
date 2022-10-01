
public class labArray {

	public static void main(String[] args) {
	int [] array = new int [6];
	
	array[0] =  1;
	array[1] =  5;
	array[2] =  2;
	array[3] =  8;	
	array[4] =  13;
	array[5] =  6;	
		
	System.out.println(array[3]);
		
	//int[] array = {1,5,2,8,13,6};//another way to create array
	
	
	System.out.println(array[array.length -1]);
	
		
	//System.out.println(array[6]);	
		
	//System.out.println(array[-1]);		
		
	for (int i =0;i<array.length; i++) {
		System.out.println(array[i]);
	}
	
	
	//Enhanced for loop
	for ( int number : array) {
		System.out.println("enhanced " + number);
	}
	
	double sum = 0;
	
	for (int number : array) {
		sum+= number;	
		System.out.println(sum);
	
	}
	
	double average = sum/array.length;
	
	System.out.println(average);
	
	
	
	
	
	
	
	
	
	
		
		
	}//Main
}//Class
