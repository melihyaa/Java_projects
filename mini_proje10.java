import java.util.Scanner;

public class mini_proje10 {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Sayi giriniz");
            int sayi = tarayici.nextInt();
            arr[i] = sayi;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}