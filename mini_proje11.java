import java.util.Scanner;

public class mini_proje11 {
    //mini karne app
    public static void main(String[] args){
        Scanner tarayici = new Scanner(System.in);
        String lect[] = new String[3];
        int note[] = new int[3];

        for(int i = 0 ; i < lect.length ; i++){
            System.out.println("Ders adini gir");
            String adi = tarayici.next();
            lect[i] = adi;
            System.out.println("notu giriniz");
            int not = tarayici.nextInt();
            note[i] = not;

        }

        for(int i = 0 ; i< lect.length ; i++){
            System.out.println(lect[i] +"="+ note[i] );
        }
        double sum_of_note = 0 ;
        for (int i = 0 ; i< note.length ; i++){
             sum_of_note = sum_of_note + note[i];
        }
        double genel_ort = (sum_of_note/3);
        System.out.println("Genel ortalama :" +genel_ort);

        if(genel_ort >= 50){
            System.out.println("Geçtiniz!");
        }else{
            System.out.println("Geçemediniz");
        }

    }
}
