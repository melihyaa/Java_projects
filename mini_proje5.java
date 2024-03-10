import java.util.Scanner;

public class mini_proje5 {
    public static void main(String[] args){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Seçim yapınız: ");
        System.out.print(" (1) Çember alani:");
        System.out.print(" (2) Dikdörtgen alani:");

        int secim = tarayici.nextInt();
        double alan;

        if(secim == 1){
            System.out.println("Yariçapı gir:");
            double yaricap = tarayici.nextDouble();

            alan = 3.14*yaricap*yaricap;
            System.out.println("Çember alani : "+alan);
        }else if(secim == 2){
            System.out.println("Kısa kenar ve uzun kenar değerlerini gir: ");
            float uzun_kenar = tarayici.nextFloat();
            float kisa_kenar = tarayici.nextFloat();

            alan = uzun_kenar*kisa_kenar;
            System.out.println("Dikdörtgen alani : "+alan);

        }

    }
}
