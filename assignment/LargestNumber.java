import java.io.*;
import java.util.Scanner;
public class LargestNumber
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Three Numbers: ");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
s.close();
if(a>b&&a>c){
System.out.println("First Number="+a+" is largest Number");
}
else if(b>a&&b>c){
System.out.println("Second Number="+b+" is largest Number");
}
else if(c>a&&c>b){
System.out.println("Third Number="+c+" is largest Number");
}
else{
	System.out.println("All Numbers are equal");
}
}
}