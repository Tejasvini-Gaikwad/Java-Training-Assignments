public class MyClass {
    static int a = 20;
    static {
        a++;
    }
    {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Myclass obj = new Myclass();
        Myclass obj2 = new Myclass();
        Myclass obj3 = new Myclass();
    }
}