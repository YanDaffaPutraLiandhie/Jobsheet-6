    import java.util.Scanner;
public class PEmilihan2Percobaan229{
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);
        float sudut1, sudut2, sudut3, totalsudut;
        System.out.print("masukkan sudut 1 :");
        sudut1 = input29.nextFloat();
        System.out.print("masukkan sudut 2 :");
        sudut2 = input29.nextFloat();
        System.out.println("masukkan sudut 3 :");
        sudut3 = input29.nextFloat();
        totalsudut = sudut1+sudut2+sudut3;

        if (totalsudut == 180){
            if ((sudut1 == 90 ) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("segitiga tersebut adalah segitiga siku-siku");
            else
            System.out.println("segitiga tersebut adalah bukan segitiga");

        }else
        System.out.println("bukan segitiga");
        

    }
}