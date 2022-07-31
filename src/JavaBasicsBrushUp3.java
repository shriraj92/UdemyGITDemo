
public class JavaBasicsBrushUp3 {

	public static void main(String[] args) {
		
		//String in Java----->String is an object that represents the sequence/collection of characters
		//2 ways to define a string
		//1.String literal and 2.using new operator
		
		//String literal
		
		String s = "Rahul Shetty Academy"; //an object will be created in java memory space 
		//if the value of string is same then there wont be new object created for s1 in java memory space.It wl be pointed to S object
		String s1 = "Rahul Shetty Academy"; 
		//If the value is different then new object wl be created in java memory space
		String s2 = "Rahul";
		
		//Using new operator
		//In this case object will be created for both s3 and s4 in java memory space.Since we are explicitly mentioning new operator to allocate seperate space
		String s3 = new String("Rahul Shetty Academy");
		String s4 = new String("Rahul Shetty Academy");
		
		String s5 = "Rahul Shetty Academy";
		//breaking the String into pieces
		String[] s5SplittedArray = s5.split(" ");
		for(int i=0;i<s5SplittedArray.length;i++)
		{
			
			System.out.println(s5SplittedArray[i]);
		}
		
		//breaking the String into pieces based on Shetty
		String[] s5SplitArray = s5.split("Shetty");
		for(int i=0;i<s5SplitArray.length;i++)
		{
			
			System.out.println(s5SplitArray[i]);
			
		}
		for(int i=0;i<s5SplitArray.length;i++)
		{
			
			System.out.println(s5SplitArray[i].trim());
			
		}
		
		System.out.println("**********************************");
		//Iterating the String to get each characters
		String s6 = "Rahul Shetty Academy";
		for(int i=0;i<s6.length();i++)
		{
			System.out.println(s6.charAt(i));
			
		}
		
		System.out.println("**********************************");
		//Iterating the String to print each characters but in reverse
		
		for(int i=s6.length()-1;i>=0;i--)
		{
			
			System.out.println(s6.charAt(i));
		}
	}

}
