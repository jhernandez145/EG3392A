/*
 * This is a basic example of exception handling
 */
public class TestExceptions {
	public static void main(String[] args){
		String str = "ABC";	//	We will try to parse this to (int)
		int number;	//	We will try to store the parsed String in here
		
		//	Placed in the try block is potentially exception throwing code
		try{
			// This will throw an exception, cannot parse "ABC" to (int)
			number = Integer.parseInt(str);
			//	This would not throw an exception if str = "123" for example
		}
		//	This will catch the exception, cannot parse "ABC" to an (int)
		catch(NumberFormatException e){System.out.println(e);}
	}
}
