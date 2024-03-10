import java.util.Scanner;

public class mini_proje6 {
    public static void main(String[] args){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("1 den 4 e kadar sayi gir:");
        int secim = tarayici.nextInt();
        System.out.println("Sayilari giriniz");
        double sayi1 = tarayici.nextFloat();
        double sayi2 = tarayici.nextFloat();

        switch (secim){
            case 1 :
                System.out.println("Sonuç : "+(sayi1+sayi2));
                break;
            case 2 :
                if(sayi1 >= sayi2){
                System.out.println("Sonuç : "+(sayi1-sayi2));
                }
                else{
                    System.out.println("Sonuç : "+(sayi2-sayi1));
                }
                break;
            case 3 :
                System.out.println("Sonuç : "+(sayi1*sayi2));
                break;
            case 4 :
                if(sayi1 >= sayi2){
                System.out.println("Sonuç : "+(sayi1/sayi2));
                }else{
                    System.out.println("Sonuç : "+(sayi2/sayi1));
                }
                break;
            default:
                System.out.println("İstenilen aralikta sayi gir");
                break;
        }

    }
}
