package Soal2;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        int n = scanner.nextInt();

        int i = 1;  // Inisialisasi variabel i untuk baris pertama
        while (i <= n) {  // Loop berjalan hingga baris ke-n
            int j = 0;
            while (j < n - i) {  // Mencetak spasi pada baris ke-i
                System.out.print(" ");
                j++;
            }

            int k = 0;
            while (k < i) {  // Mencetak # pada baris ke-i
                System.out.print("#");
                k++;
            }

            System.out.println();  // Pindah ke baris baru
            i++;
        }
        scanner.close();
    }
}

