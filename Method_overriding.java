
    class Shape
   {
    void draw()
    {
       System.out.println("can't say shape type");
    }

   }
   class Square extends Shape
   {
    @Override
    void draw()
    {
        System.out.println("square shape");
    }
   }
  public class Method_overriding
   {
    public static void main(String[] args)
     {
        Shape obj1 = new Square();
        obj1.draw();
    }
   }
