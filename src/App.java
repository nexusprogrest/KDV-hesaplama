import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("değergiriniz:");
        Scanner input = new Scanner(System.in);

        double x;
        x = input.nextDouble();
        double durum = (1000>x) ? (x / 100) * 18 : (x / 100) * 8 ;
        System.out.println(durum);
        input.close();
    }
}
