import java.util.Scanner;

public class mini_proje4 {
    public static void main(String[] args){
        //Üçgenin hipotenüsünü bul.

        double h;
        Scanner scanner = new Scanner(System.in);

        System.out.println("A kenarını giriniz");
        double a = scanner.nextDouble();

        System.out.println("B kenarını giriniz.");
        double b = scanner.nextDouble();

        h = Math.sqrt((a*a) + (b*b));

        System.out.println(h);



    }
}
