package Test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		System.out.println("String str1 is :"+str1);

		String str2 = new String("World");
		System.out.println("String str2 is :" + str2);

		char c[] = { 'a', 'b', 'c' };
		String str3 = new String(c);
		System.out.println("String str3 is :" +str3);
		
		//Length - to find string length
		int i = str1.length();
		System.out.println("Length of str1 is : " +i);
		
		//CharAt - to find a character at a particular index
		char var = str1.charAt(1);
		System.out.println("Character at index 1 of str1 is : " +var);
	
	    //Concat - To add or concatenate two strings
		System.out.println(str1.concat(str2));
		
		//Contains - to find a word in a string
		String s = "Welcome to Java programming";
		System.out.println(s.contains("to"));
		System.out.println(s.contains("To"));
		
		//ValueOf - type conversion (for converting to String)
		//String s1 = 123;
		int i1 = 123;
		String s1 = String.valueOf(i1);
		System.out.println(s1);
		
		//ToUppercase/ToLowerCase
		System.out.println(str1.toUpperCase());
		String s4 = "WORLD";
		System.out.println(s4.toLowerCase());
		
		//Equals - for comparing strings
		String st1 = "java";
		String st2 = "Java";
		String st3 = "Selenium";
		String st4 = "java";
		
		System.out.println(st1.equals(st4));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st2));
		
		//EqualsIgnoreCase
		System.out.println(st1.equalsIgnoreCase(st2));
		
		//IsEmpty
		String st5 = "";
		System.out.println(st5.isEmpty());
		
		//String comparison using symbol
		String st6 = "John";
		String st7 = "John";
		System.out.println(st6==st7);
		
		String st8 = new String("John");
		System.out.println(st6==st8);

	}

}
