package exp;

import java.util.*;
public class Main {
     static void main() {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int[] ans=new int[t];
        for(int i=1;i<=t;i++)
        {
            int sum=0;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int[] sorted=new int[n];
            int k=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]%2!=0)
                {
                    sorted[k]=arr[j];
                    k++;
                }
            }
            int c=k;
            for(int j=0;j<n;j++)
            {
               if(arr[j]%2==0)
               {
                   sorted[k]=arr[j];
                   k++;
               }
            }

            if(c%2==0)
            {
                for(int j=0;j<c-1;j++)
                {
                    sum=sum+sorted[j];
                }
                for(int j=c;j<n;j++)
                {
                    sum=sum+sorted[j];
                }
            }
            else
            {
                for(int j=0;j<n;j++)
                {
                    sum+=sorted[j];
                }
            }
            ans[i-1]=sum;
        }
         for (int a : ans) {
             System.out.println(a);
         }
    }
}

