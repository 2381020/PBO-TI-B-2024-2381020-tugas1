package Soal3;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata dalam camelCase: ");
        String input = scanner.next();

        // Menghitung jumlah kata, dimulai dari 1 (untuk kata pertama yang huruf kecil)
        int wordCount = 1;

        // Melakukan iterasi dari indeks 0 hingga panjang string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Jika ditemukan huruf besar, maka hitung sebagai kata baru
            if (Character.isUpperCase(c)) {
                wordCount++;
            }
        }

        // Output jumlah kata
        System.out.println("Jumlah kata dalam camelCase : " + wordCount);
        scanner.close();
    }
}

