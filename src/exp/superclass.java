package exp;
class superclass
{
    void bark()
    {
        System.out.println("sound was heard");
    }
    void growl()
    {
        System.out.println("danger imminent");
    }
    void greet()
    {
        System.out.println("hello");
    }
}
class subclass1 extends superclass
{
    void bark()
    {
        super.bark();
        System.out.println("sharply");
    }
    void greet()
    {
        System.out.println("hola");
    }
}
class subclass2 extends superclass
{
    void greet()
    {
        super.greet();
        System.out.println("world");
    }
}
class caller
{
    void main()
    {
        subclass1 obj1=new subclass1();
        obj1.bark();
        obj1.greet();
        subclass2 obj2=new subclass2();
        obj2.greet();
        superclass obj3=new superclass();
        obj3.bark();
        obj3.greet();
        obj3.growl();
        child c=new child();
        c.start();
    }
}


class parent
{
    public void giveshot(superclass a)
    {
        a.greet();
    }
}
class child
{
    public void start()
    {
        superclass obj4=new superclass();
        subclass1 one=new subclass1();
        subclass2 two=new subclass2();
        parent p=new parent();
        p.giveshot(one);
        p.giveshot(two);
    }
}