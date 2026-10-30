package codeForces;
import java.util.*;
public class Way_To_Long_Words {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=100 && n>=1)
        {
            String[] arr = new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.next();
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i].isEmpty() ||arr[i].length()>100)
                {
                    System.exit(0);
                }
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i].length()>10)
                {
                    System.out.println(arr[i].charAt(0)+(arr[i].length()-2)+arr[i].charAt(arr[i].length()-1));
                }
                else
                {
                    System.out.println(arr[i]);
                }
            }
        }
        else
            System.exit(0);
    }
}
