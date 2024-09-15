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