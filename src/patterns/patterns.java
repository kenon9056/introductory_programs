package patterns;
import java.util.Scanner;
public class patterns {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        pattern1(row);





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
        System.out.println();
        pattern1_variation(n);
    }
    static void pattern1_variation(int n)
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
        System.out.println();
        pattern2(n);
    }

    static void pattern2(int n)
    {
        /*  *
           ***
          *****
         *******
        *********  */

        for(int i=1;i<=n;i++)
        {
            int spaces=n-i+1;
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        pattern3(n);
    }

    static void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int spaces=n-i+1;
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        pattern4(n);
    }

    static void pattern4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int spaces=n-i+1;
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                if(i<n)
                {
                    if(j==1 || j==2*i-1)
                    {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        pattern5(n);
    }

    static void pattern5(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int spaces=i<=n ? n-i+1 : i-n+1;
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }
            if(i<=n)
            {
                for (int j = 1; j <=2*i-1 ; j++)
                {
                    if(j==1 || j==2*i-1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else
            {
                for(int j=19-(2*i);j>=1;j--)
                {
                    if(j==19-(2*i) || j==1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
  //      pascals_triangle(n);
    }

  //  static void pascals_triangle(int n)
   // {
//        for(int i=1;i<=n;i++)
//        {
//            int spaces=n-i+1;
//            for(int k=1;k<=spaces;k++)
//            {
//                System.out.print(" ");
//            }
//                for(int j=1;j<=i*2-1;j++)
//                {
//                    if(j<=(i*2-1)/2+1)
//                    {
//                        if(j%2==0)
//                        {
//                            System.out.print(" ");
//                        }
//                        else if(j!=1)
//                        {
//                            System.out.print(j+1);
//                        }
//                        else
//                        {
//                            System.out.print(j);
//                        }
//                    }
//                    else
//                    {
//                        if(j%2==0)
//                        {
//                            System.out.print(" ");
//                        }
//                        else if(j==i*2-1)
//                        {
//                            System.out.print(1);
//                        }
//                        else
//                        {
//                            System.out.print(i*2-j);
//                        }
//                    }
//                }
//                System.out.println();
//
//        }
  //  }
}
