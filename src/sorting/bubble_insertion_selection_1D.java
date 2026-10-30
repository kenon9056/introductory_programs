package sorting;
import java.util.*;
public class bubble_insertion_selection_1D
{
    public static void main()

    {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the elements of array");
    for(
    int i = 0;
    i<size;i++)

    {
        arr[i] = sc.nextInt();
    }

    int choice;
    int order;
    while(true)

    {
        System.out.println("enter 1 for bubble sorting");
        System.out.println("enter 2 for selection sorting");
        System.out.println("enter 3 insertion sorting");
        choice = sc.nextInt();
        if (choice == 1 || choice == 2 || choice == 3) {
            break;
        } else {
            System.out.println("invalid choice, choose again");
        }
    }
        while(true)

        {
            System.out.println("enter 1 for ascending order");
            System.out.println("enter 2 for descending order");
            order = sc.nextInt();
            if (order == 1 || order == 2 ) {
                break;
            } else {
                System.out.println("invalid choice, choose again");
            }
        }
    if(choice==1)

    {
        arr = bubblesort(arr,order);
        System.out.println("the sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    else if(choice==2)

    {
        arr = selectionsort(arr,order);
        System.out.println("the sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    else if(choice==3)

    {
        arr = insertionsort(arr,order);
        System.out.println("the sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

    public static int[] bubblesort(int arr[], int order) //take the largest element and push  it to the end every time;
    {
        int temp=0;
        if(order==1)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                for (int i = 0; i < arr.length - j - 1; i++)
                {
                    if (arr[i] > arr[i + 1])
                    {
                        temp= arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
            return arr;
        }
        else
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                for (int i = 0; i < arr.length - j - 1; i++)
                {
                    if (arr[i] < arr[i + 1])
                    {
                         temp= arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
            return arr;
        }
    }
    public static int[] selectionsort(int arr[], int order)//finds smallest element and tranfers it to first position
    {
        if(order==1)
        {
            for (int i = 0; i < arr.length - 1; i++)
            {
                int smallest = i;
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[smallest] > arr[j])
                    {
                        smallest = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
            return arr;
        }
        else
        {
            for(int i = 0; i < arr.length - 1; i++)
            {
                int largest = i;
                for(int j = i + 1; j < arr.length; j++)
                {
                    if(arr[largest] < arr[j])
                    {
                        largest = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
            }
            return arr;
        }
    }
    public static int[] insertionsort(int arr[], int order)
    {
        if(order==1)
        {
            for (int i = 1; i < arr.length; i++)
            {
                int temp = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > temp)
                {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
            return arr;
        }
        else
        {
            for (int i = 1; i < arr.length; i++)
            {
                int temp = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] < temp)
                {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
            return arr;
        }
    }
}
