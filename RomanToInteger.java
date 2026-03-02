//Roman Number to Integer Number I  = 1
/*I             1
V             5
X             10
L             50
C             100
D             500
M             1000   */
import java.util.*;
class RomanToInteger
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
    
        HashMap <Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int sum=0;
        for (int i=0;i<s.length();i++)
        {
            int cur = map.get(s.charAt(i));
            if(i<s.length()-1 && cur < map.get(s.charAt(i+1)))
            { 
                 sum -=cur;
            }
            else 
            {
               sum +=cur;
            }
        }
        System.out.println("Sum IS "+sum);
    }
} 