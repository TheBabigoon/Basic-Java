import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        // Menggenerate angka
        int a = rand.nextInt(10);
        int b;
        // Mengambil input User
        System.out.print("Tebak Angka\t: ");
        b = scan.nextInt();
        // Memproses Hasil
        boolean c = (a == b);
        // Menampilkan Hasil
        System.out.println("Hasil Tebakan\t: " + c);
        System.out.println("Nilai Benar\t: " + a);
        scan.close();
        System.out.println("mantap👍");
    }
}
