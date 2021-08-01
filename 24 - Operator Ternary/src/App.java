import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // OPERATOR TERNARY
        // variable = expresion ? statement_true : statement_false
        int input, a;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        a = rand.nextInt(10);
        System.out.print("Tebak Angka\t: ");
        input = scan.nextInt();
        
        String x = (input == a) ? (x = "Benar") : (x = "Salah");
        System.out.println(x);
        System.out.println("Angka yg Benar\t: " + a);

        scan.close();

        System.out.println("mantap👍");
    }
}
