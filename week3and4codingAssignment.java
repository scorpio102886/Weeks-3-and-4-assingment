
public class week3and4codingAssignment {

	public static void main(String[] args) {
		
//Question Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array Print  
			//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		System.out.println("Question 1 Below");
		
		int [] ages = {3,9,23,64,2,8,28,93}; 
		int firstMinusLast =  ages[0]-ages[ages.length-1];
		System.out.println("A. "+firstMinusLast);
		ages [ages.length-1]=56;
		int firstMinusLastB= ages[0]-ages[ages.length-1];
		System.out.println("B. "+firstMinusLastB);
		
		double avgAge = 0;	
		for (int i=0; i<ages.length; i++) {
			avgAge += ages[i];  
		}
		System.out.println("C. "+avgAge/ages.length);
		
		System.out.println("  ");
		System.out.println("Question 2 Below");
//Question 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double sum =0;
		for(String a : names) {
			sum += a.length();
		}
		System.out.println("Total Sum: " + (int)sum);
		System.out.println("Average name size is " +( sum / names.length) );			
		
		String sumOfNames = "";
		for (String str : names) {
			sumOfNames += str.trim() + " ";
			}
		System.out.println(sumOfNames);
		
		
		
//Question 3. How do you access the last element of any array?
		System.out.println("  ");
		System.out.println("Question 3 Below");
		
		String [] anyArray = {"test","testing","tested"};

		System.out.println(anyArray[anyArray.length-1]);
	
		
//Question 4.	How do you access the first element of any array?
		System.out.println("  ");
		System.out.println("Question 4 Below");
	
		System.out.println(anyArray[0]);
			
//Question 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		
		
		System.out.println("  ");
		System.out.println("Question 5 Below");
		
		
		System.out.println("No Print Requested");
		int [] nameLengths = new int[names.length];
		for (int i=0; i<names.length; i++) {
			nameLengths[i] = names[i].length();  
		}
				
				
//Question # 6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		double t = 0.0;
		for(int a : nameLengths) {
				t += a;	
		}
		System.out.println("  ");
		System.out.println("Question 6 Below");
		System.out.println("Total Sum: " + t);
				
//Question # 7 	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	
		System.out.println("  ");
		System.out.println("Question 7 Below");
		System.out.println(wordRepeat("Hello",3));
		
				
//Question # 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println("  ");
		System.out.println("Question 8 Below");
		String firstName ="Tom";
		String lastName = "Brady";
		System.out.println(fullName(firstName,lastName));

//Question # 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
			
		System.out.println("  ");
		System.out.println("Question 9 Below");
		System.out.println(isGreaterThan100(nameLengths));
		
//Question #10	Write a method that takes an array of double and returns the average of all the elements in the array.\
		System.out.println("  ");
		System.out.println("Question 10 Below");
		double [] avgcell1life = {54,47, 21,32,34,22};
		System.out.println(cell1Avg(avgcell1life));
//Question #11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.		
		System.out.println("  ");
		System.out.println("Question 11 Below");
		
		double [] avgcell2life = {34,51, 19,22,43,29};
		System.out.println(cell2Avg(avgcell2life));
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("  ");
		System.out.println("Question 12 Below");
		boolean isHotOutside = true;
		double moneyInPocket = 12.32;		
				
		System.out.println(willBuyDrink(isHotOutside,moneyInPocket));  ///////it did not like this
		
//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		System.out.println("  ");
		System.out.println("Question 13 Below");
		boolean coldOutside = true;
		double chanceOfRain = .67;	
		System.out.println(bringJacket(coldOutside,chanceOfRain));
		
	}//Main Method**Main Method**Main Method**Main Method**Main Method**Main Method**Main Method**Main Method**Main Method**

	
//Question # 7 	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	
	public static String wordRepeat(String word, int y) {
		String str = "";
	
	for(int i = 0;i<y;i++) {
		str += word;
		
	}
	return str;
	}
//Question # 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).		
	public static String fullName(String firstName, String lastName ) {
		
		return firstName+" "+lastName;
		
	}
	
//Question # 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isGreaterThan100(int[] nameLengths) {
		int sum1 =0;
		for(int number : nameLengths) {
			sum1 += number;
		}
		if (sum1>100) {
			return true;
		}
		else {
			return false;
		}
	}
	
//Question #10	Write a method that takes an array of double and returns the average of all the elements in the array.	
	
	public static double cell1Avg(double[] avgcell1life) {
	double sum=0;
	
	for(double cell1 : avgcell1life) {
		sum+= cell1;
	}
	
	return sum/avgcell1life.length;
	}
//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static double cell2Avg(double[] avgcell2life) {
		double sum7=0;
		
		for(double i : avgcell2life) {
			sum7+= i;
		}
		return sum7/avgcell2life.length;
	}	
public static boolean isFirstArrayGreater (double[] avgcell1life, double [] avgcell2life) {
//	double cell1 = cell1Avg(avgcell1life);
//	double cell2 = cell2Avg(avgcell2life);
	if (double avgcell1life[]>double avgcell2life[]) {
		return true;
	}
	else {
		return false;
}
	
	
//	///////maybe garbage below
//	double averageA =findAverage(a);
//		double averageB =findAverage(b);
//		if (avereageA > averageB) {
//			return true;
//		}
//		else
//		{
//			return false;}
//		
	//public static boolean isGroceriesMore(double)
//	

//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//	
		
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if ((isHotOutside == true) && (moneyInPocket >10.50)) {
		return true;
			}
			else {
				return false;
		}
			
	
	
	
}
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.		
	public static boolean bringJacket( boolean coldOutside, double chanceOfRain) {
		if ((coldOutside ==true)  && (chanceOfRain >.5)) {
			return true;
			}
		else {
			return false;
		}
	}
		
		
}//Class
