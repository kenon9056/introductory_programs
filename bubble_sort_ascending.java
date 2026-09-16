//take the largest element and push  it to the end every time;
import java.util.*;
public class bubble_sort_ascending {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[] arr=new int[n];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int j=0;j<n-1;j++)
        {
            for(int i=0;i<n-j-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    k=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=k;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
