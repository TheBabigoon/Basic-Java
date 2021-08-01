public class App {
    public static void main(String[] args) throws Exception {
    // TIPE DATA

        // SATUAN
        // byte
        byte b = 127;
        System.out.println("=================Byte=================");
        System.out.println("byte : " + (b+1));
        System.out.println("max  : " + Byte.MAX_VALUE);
        System.out.println("min  : " + Byte.MIN_VALUE);
        System.out.println("size : " + Byte.BYTES + " bytes/" + Byte.SIZE + " bits");
        
        // short
        short s = 32767;
        System.out.println("=================Short=================");
        System.out.println("short: " + (s+1));
        System.out.println("max  : " + Short.MAX_VALUE);
        System.out.println("min  : " + Short.MIN_VALUE);
        System.out.println("size : " + Short.BYTES + " bytes/" + Short.SIZE + " bits");
        
        // integer
        int i = 2147483647;
        System.out.println("=================Integer=================");
        System.out.println("int  : " + (i+1));
        System.out.println("max  : " + Integer.MAX_VALUE);
        System.out.println("min  : " + Integer.MIN_VALUE);
        System.out.println("size : " + Integer.BYTES + " bytes/" + Integer.SIZE + " bits");

        // long
        long l = 9223372036854775807L;
        System.out.println("=================Long=================");
        System.out.println("long : " + (l+1));
        System.out.println("max  : " + Long.MAX_VALUE);
        System.out.println("min  : " + Long.MIN_VALUE);
        System.out.println("size : " + Long.BYTES + " bytes/" + Long.SIZE + " bits");
        
        // DESIMAL
        // float
        float f = 3.4028235E38f;
        System.out.println("=================Float=================");
        System.out.println("float: " + (f+1.0f));
        System.out.println("max  : " + Float.MAX_VALUE);
        System.out.println("min  : " + Float.MIN_VALUE);
        System.out.println("size : " + Float.BYTES + " bytes/" + Float.SIZE + " bits");
        
        // double
        double d = 1.7976931348623157E308d;
        System.out.println("=================Double=================");
        System.out.println("double: " + (d+1.0d));
        System.out.println("max   : " + Double.MAX_VALUE);
        System.out.println("min   : " + Double.MIN_VALUE);
        System.out.println("size  : " + Double.BYTES + " bytes/" + Double.SIZE + " bits");

        // LAIN-LAIN
        // character
        char c = '￿';
        System.out.println("=================Character=================");
        System.out.println("char : " + (c+1));
        System.out.println("max  : " + Character.MAX_VALUE);
        System.out.println("min  : " + Character.MIN_VALUE);
        System.out.println("size : " + Character.BYTES + " bytes/" + Character.SIZE + " bits");

        // boolean
        boolean bo = false;
        System.out.println("=================Boolean=================");
        System.out.println("bool : " + bo);
        System.out.println("max  : " + Boolean.TRUE);
        System.out.println("min  : " + Boolean.FALSE);
        

        System.out.println("mantap👍");
    }
}
