import java.util.Scanner;
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements in the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the values");
    for (int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("enter the value whose index is to be found");
    int value=sc.nextInt();
    int index=linearsearch(arr,value);
    if(index==0)
    {
        System.out.println("number not found");
    }
    else
        System.out.println("index ="+index);
}
static int linearsearch(int[] arr, int value)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==value)
        {
            return i;
        }
        else
            continue;
    }
    return 0;
}