import java.util.Scanner;

public class mini_proje2 {
    public static void main(String[] args){
        //Aracın km de ne kadar yaktığını
        //kaç km yaptığını kullanıcıdan alın
        //Sürücünün ne kadar ödemesi gerektiğini hesapla.

        double total_ucret;
        Scanner scanner = new Scanner(System.in);

        System.out.println("KM başı kaç tl yaktığını gir: (ornk = 1,54 Tl)");
        double per_km = scanner.nextDouble();

        System.out.println("Kaç km yol yaptınız: (ornk 22,7 km)");
        double total_km = scanner.nextDouble();

        total_ucret = per_km * total_km;

        System.out.println("Toplam ucret : " + total_ucret + "TL");

    }
}
