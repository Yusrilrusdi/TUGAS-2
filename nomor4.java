
package PERTEMUAN3;
import java.util.ArrayList;
public class nomor4 {
    


    public static void main(String[] args) {
        // Membuat ArrayList dengan tipe data wrapper (Integer)
        ArrayList<Integer> numbers = new ArrayList<>();

        // Menambahkan nilai ke ArrayList, dimulai dari angka 100
        for (int i = 0; i < 5; i++) {
            numbers.add(100 + i * 10);
        }

        // Mencetak isi dari ArrayList
        System.out.println("Isi dari ArrayList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}


