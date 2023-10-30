package org.modul3.tugas;
import java.util.Scanner;

/**
 * class FibonacciIterative adalah kelas untuk menghitung nilai deret Fibonacci
 * secara iteratif.
 */
public class FibonacciIterative {
    private final int nilai;

    /**
     * Konstruktor untuk membuat objek FibonacciIterative dengan jumlah suku yang akan dihitung.
     *
     * @param nilai Nilai total suku untuk menghitung deret Fibonacci.
     */
    public FibonacciIterative(int nilai) {
        this.nilai = nilai;
    }

    /**
     * Metode ini menghitung deret Fibonacci secara iteratif.
     *
     * @return Nilai deret Fibonacci ke-"nilai".
     */
    public long calculate() {
        if (nilai <= 1) {
            return nilai;
        }

        long prev = 0;
        long current = 1;
        for (int i = 2; i <= nilai; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    /**
     * Metode utama untuk menguji perhitungan deret Fibonacci dengan jumlah suku yang sudah kita tentukan.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku deret Fibonacci: ");
        int nilai = scanner.nextInt();

        FibonacciIterative fibonacci = new FibonacciIterative(nilai);
        long startTime = System.nanoTime();
        long result = fibonacci.calculate();
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Perhitungan deret Fibonacci hingga suku ke " + nilai);
        System.out.println("Iteratif: Hasil = " + result);
        System.out.println("Waktu Eksekusi: " + executionTime + " ns");

        scanner.close();
    }
}
