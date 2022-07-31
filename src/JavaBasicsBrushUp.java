
public class JavaBasicsBrushUp {

	public static void main(String[] args) {
		
		//DataTypes and Variables in Java
		int num = 5;
		double numDec = 5.99;
		String website = "www.google.co.in";
		char initial = 's';
		boolean result = true;
		
		System.out.println("The Stored number is "+num);
		System.out.println(result);
		
		//Arrays in java---->It is used to store multiple values into a single variable 
		
		int[] numArr = new int[5];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 4;
		numArr[4] = 5;
		
		//System.out.println(numArr[3]);
		
		//Alternate simpler way to Declare and Initialize an array
		//This way is used when the values that needs to be assigned to a variable are known at initial stage
		
		int[] numArr2 = {1,2,3,4,5,6,7,8,9,10};
		
		
		//Iterating the values of an array through for loop
		
		for(int i = 0;i<numArr.length;i++)
		{
			
			System.out.println(numArr[i]);
		}
		
		for(int i = 0;i<numArr2.length;i++) 
		{
			
			System.out.println(numArr2[i]);
		}
		
		//String Array
		
		String[] name = {"ram","raj"};
		
		for(int i = 0;i<name.length;i++) 
		{
			
			System.out.println(name[i]);
		}
		
		//Enhanced for loop----->simplified for loop
		for(String s : name) 
		{
			System.out.println(s);
		}
		
		for(int i : numArr)
		{
			System.out.println(i);
			
		}
	}

}
