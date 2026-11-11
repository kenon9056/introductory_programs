package recursion;

public class recursion_problems {
    int x=0;
     void main(String[] args)
     {
          System.out.println(numRev(123));
          System.out.println(palin(121));
          x=0;
          System.out.println(no_zeros(4508060));
          System.out.println(steps(14));
          System.out.println(array_sortedAsc(new int[]{1,2,4,4,6}));
    }

      int numRev(int n)
    {
        //reverses a number n;
        if(n==0)
        {
            return x;
        }
        int rem=n%10;
        x=x*10+rem;
        return numRev(n/10);
    }
    boolean palin(int n)
    {
        // checks if a number is palindrome or not;
        if(numRev(n)==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int no_zeros(int n)
    {
        // returns the number of zeros found in a number;
        if(n>0)
        {
            if (n % 10 == 0)
            {
                x++;
                return no_zeros(n/10);
            }
            else
            {
                return no_zeros(n / 10);
            }
        }
        else
        {
            return x;
        }
    }
    int steps(int n)
    {
        //leetcode problem number 1342(number of steps required to reduce a number of 0 by only performing
        //division by 2(if number is even) or subtraction by 1 (is number is odd)
        return steps_helper(n,0);
    }
    int steps_helper(int n, int count)
    {
        if (n==0)
        {
            return count;
        }
        else if(n%2==0)
        {
            return steps_helper(n/2,++count);
        }
        else
        {
            return steps_helper(n-1,++count);
        }
    }
    boolean array_sortedAsc(int[] num)
    {
        //sorts an array in ascending order;
        return array_sortedAsc_helper(num, 0);
    }
    boolean array_sortedAsc_helper(int[] num, int i )
    {
        if(i==num.length-1)
        {
            return true;
        }
        else if(num[i]<=num[i+1])
        {
            return array_sortedAsc_helper(num,i+1);
        }
        else
        {
            return false;
        }
    }
}
