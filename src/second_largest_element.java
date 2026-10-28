import java.util.*;
public class second_largest_element
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n(number of elements)");
        int dig=sc.nextInt();
        int[] arr=new int[dig];
        System.out.println("enter the elements");
        for(int i=0;i<dig;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int j=0;j<dig-1;j++)
        {
          for(int i=0;i<dig-1;i++)
          {
            if (arr[i] < arr[i + 1])
            {
                k = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = k;
            }
            else if (arr[i] > arr[i + 1])
            {
                continue;
            }
            else
            {
                continue;
            }
          }
        }
        System.out.print("sorted array is- ");
        for(int i=0;i<dig;i++)
        {
            if(i<dig-1)
            {
                System.out.print(arr[i]+",");
            }
            else
            {
                System.out.println(arr[i]);
            }
        }
        for(int i=0;i<dig;i++)
        {
         if(arr[i]>arr[i+1])
         {
             System.out.println("second largest element is "+arr[i+1]);
             System.exit(0);
         }
         else if(arr[i]==arr[i+1])
         {
             if(i<dig-2)
             {
                 continue;
             }
             else
             {
                 System.out.println("there is no second largest number. largest number ="+ arr[0]);
                 break;
             }
         }
        }
    }
}

