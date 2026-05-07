public class Method_overloading 
{
    void sum()
    {
        int x=2;
        int y=3;
        int z=x+y;
        System.out.println(z);
    }
    void sum(int x,int y)
    {
       int a=4;
       int b=5;
       int c=a+b;
       System.out.println(c);
    }
    public static void main(String[] args)
     {
        Method_overloading obj=new Method_overloading();
        obj.sum();
        obj.sum(4,2);

    }
}
