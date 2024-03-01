package PERTEMUAN3;
import java.util.ArrayList;
public class nomor5 {
     public static void main(String[] args) {
        // Membuat ArrayList bertipe Integer
        ArrayList<Integer> ukuran = new ArrayList<>();

        // Menambahkan nilai ke dalam ArrayList
        ukuran.add(10);
        ukuran.add(20);
        ukuran.add(30);
        ukuran.add(40);
        ukuran.add(50);

        // Mengakses nilai pada index tertentu
        int nilaiPadaIndex2 = ukuran.get(2);
        System.out.println("Nilai pada index 2: " + nilaiPadaIndex2);

        // Mengganti nilai pada index tertentu
        ukuran.set(2, 35);
        System.out.println("ArrayList setelah mengganti nilai pada index 2: " + ukuran);

        // Menghapus nilai pada index tertentu
        ukuran.remove(3);
        System.out.println("ArrayList setelah menghapus nilai pada index 3: " + ukuran);

        // Membaca ukuran ArrayList
        int ukuranArrayList = ukuran.size();
        System.out.println("Ukuran ArrayList: " + ukuranArrayList);
    }
}


