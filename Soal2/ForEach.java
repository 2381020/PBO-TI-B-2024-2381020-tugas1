package Soal2;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        int n = scanner.nextInt();

        String[] tangga = new String[n];  // Membuat array untuk menyimpan setiap baris tangga

        // Mengisi array dengan tangga
        for (int i = 1; i <= n; i++) {
            StringBuilder baris = new StringBuilder();  // Membuat baris tangga
            for (int j = 0; j < n - i; j++) {  // Tambah spasi
                baris.append(" ");
            }
            for (int k = 0; k < i; k++) {  // Tambah #
                baris.append("#");
            }
            tangga[i - 1] = baris.toString();  // Menyimpan hasil di array
        }

        // Menggunakan for-each untuk mencetak setiap baris tangga
        System.out.println("Hasilnya adalah: ");
        for (String baris : tangga) {
            System.out.println(baris);
        }
        scanner.close();
    }
}

