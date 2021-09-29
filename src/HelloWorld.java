/* HelloWorld.java */

public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.print("Hello, " +
                "Madison. ");
        System.out.println("You are waiting for " + args[0] + ".");
        System.out.println("I hope you're doing well.");
        helloTen();
    }

    private static void helloTen()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World");
        }
    }
}
