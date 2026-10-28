package exp;

public class mix4 {
    int counter=0;
    public static void main(String[]args)
    {
        int count=0;
        mix4[] mix=new mix4[20];
        int i=0;
        while(i<20)
        {
            mix[i]=new mix4();
            mix[i].counter=mix[i].counter+1;
            count=count+1;
            count=count+mix[i].maybenew(i);
            i=i+1;
        }
        System.out.println(count+" "+mix[i].counter);
    }
    public int maybenew(int index)
    {
        if(index<5)
        {
            mix4 mixes=new mix4();
            mixes.counter=mixes.counter+1;
            return 1;
        }
        return 0;
    }
}
