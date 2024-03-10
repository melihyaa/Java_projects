import java.util.Scanner;

public class mini_proje8 {
    public static void main(String[] args){
        //veri işleme
        Scanner tarayici = new Scanner(System.in);
        System.out.println("İşlenecek veri miktarını gir:");
        int adet = tarayici.nextInt();

        while(adet >= 0){
            System.out.println("veri : "+adet);
            adet--;
        }
    }
}
