import java.util.*;
public class ex1_4 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number in seconds");
int seconds=sc.nextInt();
int hours=seconds/3600;
seconds%=3600;
int minutes=seconds/60;
seconds%=60;
System.out.println("Hours "+hours);
System.out.println("Minutes "+minutes);
System.out.println("Seconds "+seconds);
}	
}
/*
Exercise 1-4 Time
To be discussed in Tutorial
Write an algorithm that reads the amount of time in seconds and then displays the equivalent hours, minutes and
remaining seconds.
• One hour corresponds to 60 minutes.
• One minute corresponds to 60 seconds.
*/