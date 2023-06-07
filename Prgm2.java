//program to check armstrong number or not.
import java.util.Scanner;
public class Prgm2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    int result=0;
    System.out.println("enter a nuber");
    n=sc.nextInt();
    int temp=n;
    while(temp!=0){
      int rem=temp%10;
     result=result+(rem*rem*rem);
      temp=temp/10;
    }
    if(result==n)
      System.out.println(n+" is an armstrong number");
    else
      System.out.println(n+" is not an armstrong number");
  }
}