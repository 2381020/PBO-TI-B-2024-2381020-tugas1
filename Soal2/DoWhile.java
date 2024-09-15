package Soal2;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        int n = scanner.nextInt();

        int i = 1;
        do{
            int j = 0;
            // Mencetak spasi untuk setiap baris
            do{
                if (j < n - i) {
                    System.out.print(" ");
                }
                j++;
            }while (j < n - i);  // Kondisi loop untuk spasi

            int k = 0;
            // Mencetak # untuk setiap baris
            do{
                if (k < i) {
                    System.out.print("#");
                }
                k++;
            }while (k < i);  // Kondisi loop untuk #

            System.out.println();  // Pindah baris
            i++;
        }while (i <= n);  // Kondisi loop utama
        scanner.close();
    }
}
