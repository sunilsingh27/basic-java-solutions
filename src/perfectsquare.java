import java.io.*;
public class perfectsquare {
    static void checkperfectsquare (int n)
    {
        if (Math.ceil((double)Math.sqrt(n)) == (Math.floor((double)Math.sqrt(n))))
        {
            System.out.println("perfect square square ");
        }
        else
            System.out.println("not perfect square");

    }

    public static void main(String[] args) {
        {
            int n=12;
            checkperfectsquare(n);
        }
    }
}


