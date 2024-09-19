package Soal1;

public class DoWhile {
    public static void main(String[] args) {
        //Mendefinisikan array integer
        int[] arr = {1, 2, 3};

        //Inisialisasi variable  untuk menyimpan jumlah dan indeks
        int sum = 0;
        int i = 0;

        do{
            sum += arr[i]; //Menambahkan nilai elemen array ke dalam variable sum
            i++; //Meningkatkan indeks
        }while (i < arr.length);

        //Mencentak hasil jumlah
        System.out.println("Jumlahnya ketika menggunakan while loop adalah : " + sum);
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

        // Menghitung jumlah elemen array dengan do-while loop
        int sum = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < n);

        // Menampilkan hasil jumlah
        System.out.println("Jumlah dari elemen-elemen array (do-while loop): " + sum);
    }
}
*/