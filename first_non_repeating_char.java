package STRINGS;
import java.util.*;
public class first_non_repeating_char {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String s=sc.next();
        int k=0;
        char c=' ';
        for(int j=0;j<s.length()-1;j++)
        {
            c=s.charAt(j);
            for(int i=j+1;i<s.length();i++)
            {
                if(c==s.charAt(i))
                {
                    k++;
                }
                else
                {
                    continue;
                }
            }
            if(k>0)
            {
                k=0;
            }
            else if(k==0)
            {
                System.out.println("first non repeating character is "+s.charAt(j));
                System.exit(0);
            }
        }
    }
}
//fails if the repeating word occurs together and never again afterward in the sentence


