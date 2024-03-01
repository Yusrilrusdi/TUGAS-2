package PERTEMUAN3;

import java.util.Arrays;

public class nomor2 {
    public static void main(String[] args) {
        // Membuat array dimensi dengan tipe data primitif
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Metode 1: Menggunakan perulangan nested
        System.out.println("Metode 1:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Metode 2: Menggunakan perulangan foreach
        System.out.println("\nMetode 2:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Metode 3: Menggunakan method Arrays.toString() untuk setiap baris
        System.out.println("\nMetode 3:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        // Metode 4: Menggunakan method Arrays.deepToString() untuk seluruh array
        System.out.println("\nMetode 4:");
        System.out.println(Arrays.deepToString(array));

        // Metode 5: Menggunakan Stream API (hanya tersedia di Java 8 atau yang lebih baru)
        System.out.println("\nMetode 5:");
        Arrays.stream(array)
              .map(Arrays::toString)
              .forEach(System.out::println);
    }
}
