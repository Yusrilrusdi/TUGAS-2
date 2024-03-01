
package PERTEMUAN3;

import java.util.Arrays;

public class nomor1 {
    

        public static void main(String[] args) {
        // Array integer
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};

        // Array double
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};

        // Array boolean
        boolean[] booleanArray = {true, false, true, false, true, false, true, false};

        // Array char
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        // Array byte
        byte[] byteArray = {1, 2, 3, 4, 5, 6, 7, 8};

        // Array short
        short[] shortArray = {1, 2, 3, 4, 5, 6, 7, 8};

        // Array long
        long[] longArray = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L};

        // Array float
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f};
        
        // Menampilkan isi array
        System.out.println("Array integer: " + Arrays.toString(intArray));
        System.out.println("Array double: " + Arrays.toString(doubleArray));
        System.out.println("Array boolean: " + Arrays.toString(booleanArray));
        System.out.println("Array char: " + Arrays.toString(charArray));
        System.out.println("Array byte: " + Arrays.toString(byteArray));
        System.out.println("Array short: " + Arrays.toString(shortArray));
        System.out.println("Array long: " + Arrays.toString(longArray));
        System.out.println("Array float: " + Arrays.toString(floatArray));
    }
}

