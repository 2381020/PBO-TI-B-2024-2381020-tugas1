package Soal1;

public class ForLoop {
    public static void main(String[] args) {
        //Mendefinisikan array integer
        int[] arr = {1, 2, 3};

        //Inisialisasi variable  untuk menyimpan jumlah
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i]; //Menambahkan nilai elemen array ke dalam variable sum

        }

        //Mencentak hasil jumlah
        System.out.println("Jumlahnya ketika menggunakan for loop adalah : " + sum);
    }
}
