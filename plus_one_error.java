import java.util.*;
public class plus_one_error
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        double[] arr=new double[n];
        System.out.println("enter the digits");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        double num=0;
        for(int i=0;i<n;i++)
        {
           num+=arr[i]*(Math.pow(10,(n-1-i)));
        }
        double copy=num;
        int k=0;
        int m=0;
        while(copy!=0)
        {
            double c=copy%10;
            copy=copy/10;
            k++;
        }
        double inc=num+1;
        double cop=inc;
        while(cop!=0)
        {
            double c=cop%10;
            cop=cop/10;
            m++;
        }
        copy=num;
        cop=inc;
        if(m==k)
        {
            for(int i=0;i<n;i++)
            {
                arr[i]=(cop/(Math.pow(10,(n-i-1))));
                cop=cop%(Math.pow(10,(n-1-i)));
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i] + ",");
            }
        }
        else
        {
            for(int i=0;i<n+1;i++)
            {
                if(i==0)
                {
                    arr[i]=1;
                }
                else
                {
                    arr[i]=0;
                }
            }
            for(int i=0;i<n+1;i++)
            {
                System.out.print(arr[i]+",");
            }
        }
    }
}
