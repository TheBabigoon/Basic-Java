public class App {
    public static void main(String[] args) throws Exception {
        // UNARY

        // unary + dan - atau positive negative
        int a = 1;
        System.out.println("unary '+', nilai " + a + " menjadi " + +a);
        System.out.println("unary '-', nilai " + a + " menjadi " + -a);

        // unary increment(++) dan decrement(--)
        // prefix
        int b = 1;
        System.out.println("prefix increment b, " + b + " menjadi " + ++b);
        System.out.println("prefix decrement b, " + b + " menjadi " + --b);
        
        // postfix
        int c = 1;
        System.out.println("postfix increment c, " + c + " menjadi " + c++);
        System.out.println("postfix decrement c, " + c + " menjadi " + c--);
        
        // unary untuk boolean (!)
        boolean d = false;
        System.out.println(d + " menjadi " + !d);

        System.out.println("mantap👍");
    }
}
