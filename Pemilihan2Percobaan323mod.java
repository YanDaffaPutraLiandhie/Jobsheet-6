import java.util.Scanner;

public class Pemilihan2Percobaan323mod {
   public Pemilihan2Percobaan323() {
   }

   public static void main(String[] args) {
      Scanner input23 = new Scanner(System.in);
      double pajak = 0.0;
      System.out.println("Masukkan kategori : ");
      String kategori = input23.nextLine();
      System.out.println("Masukkan Besarnya Penghasilan : ");
      int penghasilan = input23.nextInt();
      int gajiBersih;
      if (kategori.equalsIgnoreCase("pekerja")) {
         if (penghasilan <= 2000000) {
            pajak = 0.1;
         } else if (penghasilan <= 3000000) {
            pajak = 0.15;
         } else {
            pajak = 0.2;
         }

         gajiBersih = (int)((double)penghasilan - pajak * (double)penghasilan);
         System.out.println("Penghasilan bersih : " + gajiBersih);
      } else if (kategori.equalsIgnoreCase("pebisnis")) {
         if (penghasilan <= 2500000) {
            pajak = 0.15;
         } else if (penghasilan <= 3500000) {
            pajak = 0.2;
         } else {
            pajak = 0.25;
         }

         gajiBersih = (int)((double)penghasilan - pajak * (double)penghasilan);
         System.out.println("Penghasilan bersih : " + gajiBersih);
      } else {
         System.out.println("Masukkan Kategori Salah");
      }

      input23.close();
   }
}
