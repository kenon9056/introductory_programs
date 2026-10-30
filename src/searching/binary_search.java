import java.util.*;

import static sorting.bubble_insertion_selection_1D.bubblesort;

public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int num=sc.nextInt();
    int[] arr=new int[num];
    for(int i=0;i<num;i++)
    {
        arr[i]=(int)(10*Math.random());
    }
    arr=bubblesort(arr,1);
    for (int j : arr) {
        System.out.print(j + ",");
    }
    System.out.println(" ");
    System.out.println("enter the element to be searched");
    int value=sc.nextInt();
    int result=binarysearch(arr,value);
    if(result==0)
    {
        System.out.println("number not found");
    }
    else System.out.println("number found at: "+result);
}
public static int binarysearch(int[] arr,int value)
{
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int middle=start+(end-start)/2;
        int store=arr[middle];
        if(store<value) start=middle+1;
        else if(store>value) end=middle-1;
        else return middle;
    }
    return 0;
}

