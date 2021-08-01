public class App {
    public static void main(String[] args) throws Exception {
        // OPERATOR BITWISE

        byte a,b,c;
        String a_bits, b_bits, c_bits;
        
        // Shift Left (<<)
        System.out.println("========== Shift Left");
        a = 3;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(a_bits + " = " + a);
        b = (byte)(a<<3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.println(b_bits + " = " + b);
        
        // Shift Right (>>)
        System.out.println("========== Shift Right");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(a_bits + " = " + a);
        b = (byte)(a>>2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.println(b_bits + " = " + b);
        
        // Bitwise OR (|)
        System.out.println("========== Bitwise OR");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(a_bits + " = " + a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.println(b_bits + " = " + b);
        c = (byte)(a|b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.println("--------------OR");
        System.out.println(c_bits + " = " + c);

        // Bitwise AND (&)
        System.out.println("========== Bitwise AND");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(a_bits + " = " + a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.println(b_bits + " = " + b);
        c = (byte)(a&b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.println("--------------AND");
        System.out.println(c_bits + " = " + c);
        
        // Bitwise XOR (^)
        System.out.println("========== Bitwise XOR");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(a_bits + " = " + a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.println(b_bits + " = " + b);
        c = (byte)(a^b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.println("--------------XOR");
        System.out.println(c_bits + " = " + c);
        
        // Bitwise NOT (~)
        System.out.println("========== Bitwise NOT");
        a = 24;
        b = (byte)~a;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(a_bits + " = " + a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0").substring(24);
        System.out.println(b_bits + " = " + b);
        
        System.out.println("\nmantap👍");
    }
}
