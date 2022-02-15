public class AccessModifierDemo
{
    static int x = 100;
    int y = 100;
    public void increment()
    {
        x++; y++;
    }
    public static void main( String[] args )
    {
        AccessModifierDemo t1 = new AccessModifierDemo();
        AccessModifierDemo t2 = new AccessModifierDemo();
        t1.increment();
        t2.increment();
        System.out.println(t2.y);
        System.out.println(AccessModifierDemo.x); //accessed without any instance of class.
    }
}
