public class App {
    public static void main(String[] args) throws Exception {
        // KONVERSI DATA

        int a = 10;
        System.out.println("int\t: " + a);

        // Memperluas rentang data
        long b = a;
        System.out.println("long\t: " + b);

        // Memperkecil rentang data
        byte c = (byte)a;
        System.out.println("byte\t: " + c);

        // Casting Pembagian
        int d = 15;int e = 4;
        float f = d/e;

        System.out.println("d / e = " + f);

        float g = (float)d/e;

        System.out.println("(float)d / e = " + g);

        float h = e/f;

        System.out.println("e / f = " + h);
        
        System.out.println("mantap👍");
    }
}
