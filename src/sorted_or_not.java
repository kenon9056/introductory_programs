import java.util.*;
public class sorted_or_not {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int dig=sc.nextInt();
        int[] arr=new int[dig];
        System.out.println("enter the elements");
        for(int i=0;i<dig;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<dig-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }
            else if(arr[i]==arr[i+1])
            {
                continue;
            }
            else if(arr[i]>arr[i+1])
            {
                k++;
            }
        }
        if(k>0)
        {
            System.out.println("array is not sorted");
        }
        else
        {
            System.out.println("array is sorted");
        }
    }
}
