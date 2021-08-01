import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // SWITCH CASE
        String input;
        Scanner scan = new Scanner(System.in);

        System.out.print("Panggil Nama\t: ");
        input = scan.next();

        switch (input.toLowerCase()) {
            case "wawan":
                System.out.println(input + " Hadir");
                break; // Jika tidak ada break maka akan mengeksekusi case selanjunya juga
            case "ucup":
                System.out.println(input + " Hadir");
                break;
            case "saya":
                System.out.println(input + " Hadir");
                break;
            case "anda":
                System.out.println(input + " Hadir");
                break;
            default:
                System.out.println(input + " Tidak Hadir");
                break;
        }

        scan.close();
        System.out.println("mantap👍");
    }
}
