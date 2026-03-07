/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/
import java.util.*;
class PlusOneApp
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int a[]=new int[]{9};
     try{
         String s="";
         for(int i=0;i<a.length;i++)
         {
               s=s+a[i];
         };
         int as=Integer.parseInt(s);
        
         int n=as+1;
         String so=String.valueOf(n);
         int nums[]=new int[so.length()];
         for(int i=0;i<nums.length;i++)
         {     nums[i]=so.charAt(i)-'0';
         }
         System.out.println(""+Arrays.toString(nums));
                
         
        }
     catch(Exception ex)
     {
          System.out.println(" Class Cast Exception");
     }
         
    }
}