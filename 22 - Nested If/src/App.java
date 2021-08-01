public class App {
    public static void main(String[] args) throws Exception {
        // Nested If
        // If didalam If
        System.out.println("Start\n");
        int a = 0;
        int b = 0;

        if (a == 5){
            if (b == 10){
                System.out.println("a == 5\nb == 10");
            }else{
                System.out.println("a == 5\nb != 10");
            }
        }else if(b == 10){
            System.out.println("a != 5\nb == 10");
        }else{
            System.out.println("a != 5\nb != 10");
        }

        System.out.println("\nFinish");
        System.out.println("mantap👍");
    }
}
