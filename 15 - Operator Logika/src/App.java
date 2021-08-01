public class App {
    public static void main(String[] args) throws Exception {
        // OPERATOR LOGIKA

        boolean a,b,c;

        // OR (||)
        System.out.println("=====\tOR\t=====\t=====\t=====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + "\t||\t" + b + "\t=\t" + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + "\t||\t" + b + "\t=\t" + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + "\t||\t" + b + "\t=\t" + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + "\t||\t" + b + "\t=\t" + c);

        // AND (&&)
        System.out.println("=====\tAND\t=====\t=====\t=====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + "\t&&\t" + b + "\t=\t" + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + "\t&&\t" + b + "\t=\t" + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + "\t&&\t" + b + "\t=\t" + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + "\t&&\t" + b + "\t=\t" + c);

        // XOR (^)
        System.out.println("=====\tXOR\t=====\t=====\t=====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + "\t^\t" + b + "\t=\t" + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + "\t^\t" + b + "\t=\t" + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + "\t^\t" + b + "\t=\t" + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + "\t^\t" + b + "\t=\t" + c);

        // NOT (!)
        System.out.println("=====\tNOT\t=====\t=====\t=====");
        a = true;
        c = !a;
        System.out.println(a+"\t!\tmenjadi\t\t"+c);
        b = false;
        c = !b;
        System.out.println(b+"\t!\tmenjadi\t\t"+c);

        System.out.println("mantap👍");
    }
}
