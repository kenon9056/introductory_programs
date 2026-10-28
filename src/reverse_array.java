import java.util.*;
public class reverse_array
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("enter the elements of array");
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=0;
        if(N%2==0)
        {
            for(int i=0;i<N/2;i++)
            {
                k=arr[i];
                arr[i]=arr[N-1-i];
                arr[N-1-i]=k;
            }
        }
        else
        {
            for(int i=0;i<(N/2);i++)
            {
                k=arr[i];
                arr[i]=arr[N-1-i];
                arr[N-1-i]=k;
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
