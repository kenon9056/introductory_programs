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
        return helper_steps(n,0);
    }
    int helper_steps(int n, int count)
    {
        if (n==0)
        {
            return count;
        }
        else if(n%2==0)
        {
            return helper_steps(n/2,++count);
        }
        else
        {
            return helper_steps(n-1,++count);
        }
    }
    boolean array_sortedAsc(int[] num) {return array_sortedAsc_helper(num, 0);}
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
