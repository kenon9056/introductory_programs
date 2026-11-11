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
        // this program needs to be fixed
        //as it only prints the proper pattern for n==5
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
        pattern6(n);
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

    static void pattern6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(j<=i)
                {
                    System.out.print(j);
                }
                else if(j>=2*n-i+1)
                {
                    System.out.print(2*n-j+1);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        pattern7(n);
    }

    static void pattern7(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(i<=n && j<=i)
                {
                    System.out.print("*");
                }
                else if(i<=n && j>=2*n-i+1)
                {
                    System.out.print("*");
                }
                else if( i>n && j<=2*n-i)
                {
                    System.out.print("*");
                }
                else if(i>n && j>=i+1)
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
        System.out.println();
        pattern8(n,n);
    }

    static void pattern8(int row, int column)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if(i==1 || i== row)
                {
                    System.out.print("*");
                }
                else
                {
                    if(j==1 || j== column)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        pattern8_var(row,row);
    }

    static void pattern8_var(int row, int column)
    {
        for(int i=1;i<=row;i++)
        {
            int spaces = row - i + 1;
            for (int k = 1; k <= spaces; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= column; j++)
            {
                if (i == 1 || i == row)
                {
                    System.out.print("*");
                } else
                {
                    if (j == 1 || j == column)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        pattern9(row);
    }

    static void pattern9(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int sum=(i*(i+1))/2;
            for(int j=sum-i+1;j<=sum;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        pattern10(n);
    }

    static void pattern10(int n)
    {
        int k;
        for(int i=1;i<=n;i++)
        {
            k=i%2==0 ? 0:1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k=k==1 ? 0:1;
            }
            System.out.println();
        }
        System.out.println();
        pattern11(n);
    }

  static void pattern11(int n)
    {
        //stuck at this prob.
        //
//          *   *
//         * * * *
//        *   *   *

//        int col=2*n-1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=col;j++)
//            {
//                if(i%2!=0)
//                {
//                    if(j>=col-n-i && j<=n+i+1)
//                    {
//
//                    }
//                }
//                else
//                    break;
//            }
//            System.out.println();
//        }
        pattern12(n);
    }

    static void pattern12(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        pattern13(n);
    }

    static void pattern13(int n)
    {
       for(int i=1;i<=n;i++)
       {
            for (char a = (char)(65+n-i); a <=64+n ; a++)
            {
                System.out.print(a+" ");
            }
           System.out.println();
       }
        System.out.println();
       pattern14(n);
    }

    static void pattern14(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (char a = (char)(65+n-i); a >='A' ; a--)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
