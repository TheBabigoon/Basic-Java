import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // KALKULATOR SWITCH CASE
        float a,b,c;
        char o;
        Scanner scan = new Scanner(System.in);

        System.out.print("angka 1\t: ");
        a = scan.nextFloat();
        System.out.print("+,-,*,/\t: ");
        o = scan.next().charAt(0);
        System.out.print("angka 2\t: ");
        b = scan.nextFloat();

        System.out.println();
        switch (o) {
            case '+':
                c = a + b;
                System.out.println(a + " " + o + " " + b + " = " + c);
                break;
            case '-':
                c = a - b;
                System.out.println(a + " " + o + " " + b + " = " + c);
                break;
            case '*':
                c = a * b;
                System.out.println(a + " " + o + " " + b + " = " + c);
                break;
            case ('/'):
                c = a / b;
                System.out.println(a + " " + o + " " + b + " = " + c);
                break;
            default:
                System.out.println("Operator Not Found!");
                break;
        }
        System.out.println();

        scan.close();
        System.out.println("mantap👍");
    }
}
