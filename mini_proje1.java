import java.util.Scanner;

public class mini_proje1 {
    public static void main(String[] args){
        //kullanıcıdan boy ve kilo değerlerini al
        //indeks =  kilo / boy *boy

        double indeks;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz (ornk = 1,72)");

        double boy = scanner.nextDouble();

        System.out.println("Kilonuzu giriniz:");

        double kilo = scanner.nextDouble();

        indeks = kilo / (boy*boy);

        System.out.println("Vücudunuzun boy kilo indeksi =  " + indeks);

        if(indeks < 18.5){
            System.out.println("Zayıf");
        }else if(indeks > 18.5 && indeks < 25){
            System.out.println("Normal");
        }else if(indeks > 25 && indeks < 30){
            System.out.println("Fazla kilolu");
        }else{
            System.out.println("Obez");
        }

    }
}
