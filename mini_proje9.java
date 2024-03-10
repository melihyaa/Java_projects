import java.util.Scanner;

public class mini_proje9 {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        while (true) {
            System.out.println("Sayi giriniz");
            int sayi = tarayici.nextInt();
            if (sayi % 2 == 0 || sayi == 0) {
                System.out.println("Sayi çift.");
            } else {
                System.out.println("Sayi tektir.");
            }
            System.out.println("Çıkış için (1) devam etmek için diğer sayilar");
            int sayi_2 = tarayici.nextInt();
            if(sayi_2 == 1){
                System.out.println("Çıkış yapildi.");
                break;
            }
        }
    }
}