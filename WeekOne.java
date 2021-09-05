import java.util.*;
public class WeekOne{
	public static void main(String[] args) {
System.out.println("Enter odd numer: to draw pyramid");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i+=2){
for(int j=1;j<=((n/2)-(i/2));j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){//1
System.out.print(k);
}
System.out.println();
 
}

String userDirectory = System.getProperty("user.dir");
 System.out.println(userDirectory);

}
}