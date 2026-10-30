package codeForces;
import java.util.*;
public class Watermelon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int i=1;
        int j=w-1;
        while(i<=j)
        {
            if((i+j)==w)
            {
                if(i%2==0 && j%2==0)
                {
                    System.out.println("YES");
                    System.exit(0);
                }
                else
                {
                    i++;
                    j--;
                }
            }
            else
            {
                i++;
                j--;
            }

        }
        System.out.println("NO");
    }
}
