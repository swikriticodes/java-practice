public class Return
 {
    public int sum()
    {
        int no1=2,no2=4;
        int result=no1+no2;
        return result;
    }
    public static void main(String[] args)
     {
      Return obj=new Return();
      int result=obj.sum();
      System.out.println(result);
      int a=obj.sum();
      System.out.println(a+100);
    }
}
