package exp;
import java.util.Scanner;
public class patterns {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        pattern1(row);
        pattern1_improved(row);
    }


    static void pattern1(int n)
    {
        if(n%2==0)
        {
            System.out.println("this pattern is only printable for odd no of rows");
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                if(i<=(n/2)+1)
                {
                        for(int k=1;k<=i;k++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                }
                else
                {
                    for(int k=1;k<=n-i+1;k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
    static void pattern1_improved(int n)
    {
        int total_col;
       for(int i=1;i<=2*n;i++)
       {
           if (i > n)
           {
                total_col = 2 * n - i ;
           } else
           {
                total_col = i;
           }
           /*the above if else an be directly written as
             int total_col= i>n ? 2*n-i : row  */
           for (int j = 1; j <= total_col; j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
