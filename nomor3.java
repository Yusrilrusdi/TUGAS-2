
package PERTEMUAN3;
import java.util.Scanner;
public class nomor3 {
     public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Mendefinisikan ukuran array 2 dimensi
        System.out.print("Masukkan jumlah baris: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int columns = scanner.nextInt();
        
        // Membuat array 2 dimensi
        int[][] array2D = new int[rows][columns];
        
        // Input nilai ke dalam array 2 dimensi
        System.out.println("Masukkan nilai-nilai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Masukkan nilai untuk baris ke-" + (i+1) + ", kolom ke-" + (j+1) + ": ");
                array2D[i][j] = scanner.nextInt();
            }
        }
        
        // Cetak isi array 2 dimensi
        System.out.println("Isi array 2 dimensi:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); // Untuk pindah ke baris berikutnya setelah satu baris selesai dicetak
        }
        
        // Menutup objek Scanner
        scanner.close();
    }
}


