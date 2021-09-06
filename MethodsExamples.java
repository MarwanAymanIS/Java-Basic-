import java.util.*;
public class MethodsExamples {
/*	Exercise 5-1 Power
	Write a program that implements the definition of power,where m and n are integers entered by the user, such that
	m is the base and n is the exponent:
	power(m,n) = m
	n
	Write a main to test your method. */
	public static long power(int m, int n){ //m^n
	return(long)Math.pow(m,n);
	}
	public static long power1(int m, int n){ //m^n
		Long result=1l;
		for(int i =0;i<n;i++){
			result*=m;
		}	
		return result;	
		
		}
/*	Exercise 5-5 Palindrome
	Write a java program that determines whether the text the user inputs is a palindrome or not. A palindrome is
	a piece of text that can be read the same way in either direction (left to right and right to left). Examples of
	palindromes include words such as racecar and noon.
*/
	public static boolean isPalindrome(String input){
		input=input.toLowerCase();
		int median=(input.length()/2) ;
		System.out.println(median);
		String firstHalf=input.substring(0,median);
		String secondHalfReversed="";
		int mm=(input.length()%2==1)?(input.length()/2)+1:(input.length()/2);
		for(int i=input.length()-1;i>=mm ;i--){
			secondHalfReversed+=input.charAt(i);
		}
		System.out.println(firstHalf+"  "+secondHalfReversed);
		return (secondHalfReversed.equals(firstHalf));
		
		
	}
	/*Exercise 5-9 Perfect Number

A perfect number is a positive integer that is equal to the sum of its proper positive divisors. A proper divisor of an
integer n is an integer between 1 (inclusive) and n (exclusive) that divides n with no remainder. For example, 6 is
a perfect number because 6 = 1+2+3.
Write an algorithm that prints all perfect integers that are less than or equal to a given integer n. The program
should consist of four methods:
• A method that will calculate the sum of divisors of a given integer n
• A method that will check whether a number is a perfect number
• A method that will print all perfect numbers that are less than or equal a given integer n
• The main method
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void perfectNumbers(int n){
		for(int i=1;i<=n;i++){
		  
		  if(isPerfect(i))
			  System.out.println(i);
		  

	}
		}
	public static boolean isPerfect(int n){
		return n==sumOfDivisors(n);
	}
	public static int sumOfDivisors(int n){
		int result=0;
		for(int i=1;i<n;i++){
			if(n%i==0)
				result+=i;
			
		
	}		return result;

	}
		
		
	//}
	
	
	public static void main(String[] args){
		int n=2;
		int m=4;
		//System.out.println("powerUsingMath"+" "+n+"^"+m+" = "+power(n,m));
		//System.out.println("powerUsingForLoop"+" "+n+"^"+m+" = "+power1(n,m));
		//String input="noon";
		//System.out.println("IS "+input+" PALINDROME? "+isPalindrome(input));
		perfectNumbers(11220);		
	}

}
