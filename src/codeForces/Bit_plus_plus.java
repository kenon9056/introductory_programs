package codeForces;
import java.util.*;
public class Bit_plus_plus {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int n=sc.nextInt();
        if(n<1 || n>150)
        {
            System.exit(0);
        }
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        for(String j : arr)
        {
            if(j.charAt(0)=='X')
            {
                if(j.charAt(1)=='+')
                {
                    x++;
                }
                else
                {
                    x--;
                }
            }
            else if(j.charAt(0)=='+')
            {
                x++;
            }
            else if(j.charAt(0)=='-')
            {
                x--;
            }
        }
        System.out.println(x);
    }
}
