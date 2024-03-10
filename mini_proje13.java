import java.util.Scanner;

public class mini_proje13 {
    //Gelişmiş Not Hesaplama
    public static void main(String[] args){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Vize-1 notunu giriniz");
        double vize1= tarayici.nextDouble();
        System.out.println("Vize-2 notunu gir");
        double vize2 = tarayici.nextDouble();
        System.out.println("Final notunu gir");
        double Final= tarayici.nextDouble();

        System.out.println("Okuldaki genel ortalama kaçtır?");
        double okul_genel_ort= tarayici.nextDouble();

        double myself_genel_ort = (vize1*3)/10 + (vize2*3)/10 + (Final*4)/10;

        if(myself_genel_ort >= 90 ){
            System.out.println("AA aldın");
        }else if(myself_genel_ort >= 85){
            System.out.println("BA aldın");
        }else if(myself_genel_ort >=80){
            System.out.println("BB aldın");
        }else if(myself_genel_ort >= 75){
            System.out.println("CB aldın");
        }else if(myself_genel_ort >= 70){
            System.out.println("CC aldın");
        }else if(myself_genel_ort >= 65){
            System.out.println("DC aldın");
        }else if(myself_genel_ort >= 60){
            System.out.println("DD aldın");

        }else{
            System.out.println("Kaldın");
        }


    }
}
