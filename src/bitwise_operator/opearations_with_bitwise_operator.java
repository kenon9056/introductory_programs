package bitwise_operator;

public class opearations_with_bitwise_operator {
    static void main(String[] args)
    {
        System.out.println(noOfDigits(2,2));
        System.out.println(powerOftwo(128));
        System.out.println(sumXOR(6));
        System.out.println(rangeXOR(3,6));

    }

    static int noOfDigits(int n, int b)
    {
        // returns the no of digits present in base b of number n
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }

    static String powerOftwo(int n)
    {
//        if(n<=0)
//        {
//            return "number is less than or equal to 0";
//        }
//        int count=0;
//        int ans=0;
//        while(n>0)
//        {
//            ans=n&1;
//            n=n>>1;
//            if(ans==1)
//            {
//                count++;
//            }
//        }
//        if(count==1)
//        {
//            return "number is a power of 2";
//        }
//        else
//            return "number is not a power of 2";

        // second method

        if(n<=0)
        return "number is less than or equal to 0";
        int ans=0;
        ans=n&(n-1);
        if(ans==0)
        return "number is power of 2";
        else
        return "number is not power of 2";

    }


static int sumXOR(int a)
{
    //XOR of all the numbers from 0 to a with a included
    if(a%4==0)
        return a;
    else if(a%4==1)
        return 1;
    else if(a%4==2)
        return a+1;
    else
        return 0;
}

static int rangeXOR(int a, int b)
{
    int x=sumXOR(a-1);
    int sum=sumXOR(b);
    return sum^x;
}
}
