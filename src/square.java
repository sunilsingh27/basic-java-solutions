import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        double n=sc.nextDouble();

       double square = Math.sqrt(n);
        System.out.println(square);
    }
}
