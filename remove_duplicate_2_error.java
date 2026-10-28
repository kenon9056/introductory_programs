import java.util.*;
public class remove_duplicate_2_error {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int dig=sc.nextInt();
        int[] arr=new int[dig];
        int[] sec=new int[dig];
        System.out.println("enter the elements");
        for(int i=0;i<dig;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=1;
        for(int j=0;j<dig-1;j++)
        {
            for (int i = 0; i < dig - 1; i++)
            {
                if (arr[i] == arr[i + 1])
                {
                    sec[i] = arr[i + 1];
                } else
                {
                    sec[i] = arr[i + 1];
                    if(j==0)
                    {
                        k++;
                    }
                }
            }
            for (int l = 0; l < dig; l++)
            {
                arr[l] = sec[l];
            }
        }
        System.out.println("number of unique numbers="+k);
        for(int i=0;i<dig-1;i++)
        {
            System.out.print(sec[i]+",");
        }

    }
}
