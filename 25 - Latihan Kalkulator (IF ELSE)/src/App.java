import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // KALKULATOR IF ELSE
        float a,b,c;
        char o;
        Scanner scan = new Scanner(System.in);
        System.out.print("angka 1\t: ");
        a = scan.nextFloat();
        System.out.print("+,-,x,/\t: ");
        o = scan.next().charAt(0);
        System.out.print("angka 2\t: ");
        b = scan.nextFloat();

        System.out.println();
        if(o == '+') {c = a + b;System.out.println(a + " " + o + " " + b + " = " + c);}
        else if(o == '-') {c = a - b;System.out.println(a + " " + o + " " + b + " = " + c);}
        else if(o == '*' || o == 'x') {c = a * b;System.out.println(a + " " + o + " " + b + " = " + c);}
        else if(o == '/' || o == ':') {c = a / b;System.out.println(a + " " + o + " " + b + " = " + c);}
        else System.out.println("Operator Not Found!");
        System.out.println();

        scan.close();
        System.out.println("mantap👍");
    }
}
