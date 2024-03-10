import java.util.Scanner;

public class mini_proje7 {
    public static void main(String[] args) {
        //İsim tekrarlama örneği:
        Scanner tarayici = new Scanner(System.in);
        System.out.println("İsminizi gir");
        String ad = tarayici.next();
        System.out.println("Kaç kere tekrarlanacak");
        int tekrar = tarayici.nextInt();

        for(int i = 1 ; i<=tekrar ; i++){
            System.out.println(ad+" - "+i);
        }
    }
}
