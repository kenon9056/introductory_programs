//asssume first element is smallest and start comparing
//run loop to find the smallest and then swap just once
//one swap per one iteration unlike bubble where we swap as soon as we find greater or smaller number
import java.util.*;
public class selection_sort {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n-1;j++)
        {
            int smallest=j;
            for(int i=j+1;i<n;i++)
            {
                if(arr[smallest]>arr[i])
                {
                    smallest=i;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
