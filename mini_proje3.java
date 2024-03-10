import java.util.Scanner;

public class mini_proje3 {
    public static void main(String[] args){
        //Kullanıcıdan aldığın iki sayının değerlerini değiştirin
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int sayi_1 = scanner.nextInt();

        System.out.println("Enter second number");
        int sayi_2 = scanner.nextInt();

        System.out.println("First number = " + sayi_1 + " Second number = " + sayi_2);

        int ilk_durum = sayi_1;
        sayi_1 = sayi_2;
        sayi_2 = ilk_durum;


        System.out.println("Degisimden sonra ==>" + " First number = " + sayi_1 + " Second number = " + sayi_2);


    }
}
