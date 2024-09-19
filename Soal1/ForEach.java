package Soal1;

public class ForEach {
    public static void main(String[] args) {
        //Mendefinisikan array integer
        int[] arr = {1, 2, 3};

        //Inisialisasi variable  untuk menyimpan jumlah
        int sum = 0;

        for (int num : arr){
            sum += num; //Menambahkan nilai elemen array ke dalam variable sum

        }

        //Mencentak hasil jumlah
        System.out.println("Jumlahnya ketika menggunakan for-each loop adalah : " + sum);
    }
}
/*
 Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah elemen array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();

        // Membuat array dengan panjang sesuai input pengguna
        int[] numbers = new int[n];

        // Meminta input untuk setiap elemen array
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("elemen array ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Menghitung jumlah elemen array dengan for-each loop
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Menampilkan hasil jumlah
        System.out.println("Jumlah dari elemen-elemen array (for-each loop): " + sum);
    }
}
*/