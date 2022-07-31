import java.util.ArrayList;

public class JavaBasicsBrushUp2 {

	public static void main(String[] args) {
		
		int[] numArr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(numArr.length);
	
		// if/if else loop to fetch the array values that are multiple/divisible by 2
		
		for(int i =0;i<numArr.length;i++) 
		{
			if(numArr[i] % 2 == 0)
			{
				System.out.println(numArr[i]);
			}
			else
			{
				System.out.println(numArr[i]+" is not multiple of 2");
			}
		}
		

		// Check if array values has multiple of 2
		// break keyword helps to stop the loop.
		// In this case break keyword is used to stop the loop once multiple of 2 is identified
		// Used simplified for loop in this case
		
		for(int j : numArr)
		{
			if(j % 2 == 0)
			{
				System.out.println(j);
				break;
			}
			else
			{
				System.out.println(j + " is not multiple of 2");
			}
		}
		
		//ArrayList in Java
		//To overcome the cons of an array.Arraylist are used.It is an dynamic array.Size of the array can be modified at any given time
		
		ArrayList<String> numArrList = new ArrayList<String>();
		numArrList.add("Rahul");
		numArrList.add("Shetty");
		numArrList.add("Academy");
		
		System.out.println(numArrList.get(0));
		System.out.println(numArrList.get(1));
		System.out.println(numArrList.get(2));
		
		numArrList.remove(1);
		System.out.println(numArrList.get(1));
		
		
		
	}

}
