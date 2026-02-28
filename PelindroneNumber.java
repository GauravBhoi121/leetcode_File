//9. Palindrome Number
import java.util.*;
class PelindroneNumber
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int num=121;
       int temp=num,rem=0,sum=0;
 
       while(temp>0)
       {
           rem = temp%10;
           sum= sum*10+rem;   
           temp/=10;
       }
       System.out.println(""+sum);
   }
}