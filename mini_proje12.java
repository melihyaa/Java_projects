import java.util.Scanner;

public class mini_proje12 {
    public static void main(String[] args){
        //kullanıcıdan alınan 3 sayıdan en büyüğünü bulmak.
        Scanner tarayici = new Scanner(System.in);

        int arr[] = new int[3];

        for(int i = 0 ; i< arr.length ; i++){

            System.out.println("Sayi giriniz");
            int sayi = tarayici.nextInt();
            arr[i] = sayi;
        }
        if(arr[0] > arr[1] && arr[0] > arr[2]){
            System.out.println("En büyük sayi =" +arr[0]);
        }
        else if(arr[1] > arr[0] && arr[1] > arr[2]){
            System.out.println("En büyük sayi = " +arr[1]);
        }
        else {
            System.out.println("En büyük sayi = "+arr[2]);
        }
    }
}
