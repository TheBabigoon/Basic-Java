import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Pengelompokan Operasi Aritmatika

        // Perkalian dan Pembagian dilakukan terlebih dahulu
        int a;
        a = 10 + 5 * 2 / 5;
        System.out.println(a);
        
        // Nilai yg di kelompokan akan dilakukan terlebuh dahulu
        // menggunakan ()
        a = (10 + 5) * 2 / 5;
        System.out.println(a);

        // Menghitung Persamaan Kuadrat
        Scanner scan = new Scanner(System.in);
        System.out.println("============ Menghitung Persamaan Kuadrat");
        int m,x,c;
        System.out.print("nilai x\t: ");
        x = scan.nextInt();
        System.out.print("nilai m\t: ");
        m = scan.nextInt();
        System.out.print("nilai c\t: ");
        c = scan.nextInt();
        int y = m * x * x + c;
        System.out.println("nilai y\t: " + y);

        scan.close();

        System.out.println("mantap👍");
    }
}
