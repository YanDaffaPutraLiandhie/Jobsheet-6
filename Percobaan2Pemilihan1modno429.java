import java.util.Scanner;
public class Percobaan2Pemilihan1modno429{
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("masukkan tahun :");
        int tahun = input29.nextInt();
        
        if ((tahun % 4) == 0){
            if ((tahun % 100) == 0){
                if((tahun %400) == 0)
 
                    System.out.println("tahun kabisat");
                } else {
                    System.out.println("bukan tahun kabisat");
                } 
            }
            
    }
}
