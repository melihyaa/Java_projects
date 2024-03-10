import java.util.Scanner;

public class mini_proje14 {
    public static void main(String[] args){
        //CALCULATING FACTORİAL
        Scanner tarayici = new Scanner(System.in);
        System.out.println("Enter number");
        int num = tarayici.nextInt();
        int fact = 1 ;
        for(int i = num ; i >= 1 ; i-- ){
            fact *=i;

        }
        System.out.println(fact);
    }
}
