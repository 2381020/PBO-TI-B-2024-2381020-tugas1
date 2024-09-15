package Soal3;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata dalam camelCase: ");
        String input = scanner.next();

        // Menghitung jumlah kata, dimulai dari 1
        int wordCount = 1;

        // Ubah string menjadi array karakter
        char[] chars = input.toCharArray();

        // Iterasi melalui setiap karakter di array
        for (char c : chars) {
            // Jika ada huruf besar, hitung sebagai kata baru
            if (Character.isUpperCase(c)) {
                wordCount++;
            }
        }

        // Output jumlah kata
        System.out.println("Jumlah kata dalam camelCase : " + wordCount);
        scanner.close();
    }
}

