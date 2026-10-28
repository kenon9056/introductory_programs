package exp;

class dog{
    int size;
    String name;
    void bark()
    {
        if(size>60)
        {
            System.out.println("Woof");
        }
        else if(size>14)
        {
            System.out.println("ruff");
        }
        else {
            System.out.println("yip");
        }
    }
}
class DogTestDrive
{
    public static void main(String[]args)
    {
        dog one=new dog();
        one.size=70;
        dog two=new dog();
        two.size=8;
        dog three=new dog();
        three.size=35;
        one.bark();
        two.bark();
        three.bark();

    }
}