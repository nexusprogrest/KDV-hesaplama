import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ücret değerini giriniz:");
        Scanner input = new Scanner(System.in);

        double x ,a ,b;
        a = 0.18; b=0.08;
        x = input.nextDouble();
        double KDV_oranı = 1000>x ?  a : b;
        double KDV_tutarı = (1000>x) ? (x * a) : (x * b) ;
        double y = x;
        System.out.println("KDV'siz fiyatı" + x);
        System.out.println("KDV oranı: " + KDV_oranı);
        System.out.println("KDV dahil fiyat" + (KDV_tutarı + x));
        System.out.println("KDV tutarı" + KDV_tutarı);
        input.close();
    }
}
