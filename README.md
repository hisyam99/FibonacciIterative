## Aplikasi Menghitung Deret Fibonacci Menggunakan Konsep Iteratif

### Getting Started
Program ini adalah sebuah aplikasi sederhana untuk menghitung nilai deret Fibonacci secara iteratif. Deret Fibonacci adalah deret bilangan yang setiap anggota selanjutnya adalah hasil penjumlahan dua anggota sebelumnya. Program ini memungkinkan pengguna untuk menghitung deret Fibonacci hingga suku ke-"n" yang diinginkan.

### Prerequisite
Sebelum menjalankan program ini, pastikan telah menginstal Java Development Kit (JDK) di komputer masing - masing. Atau juga dapat mengunduhnya dari [situs resmi Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) atau menggunakan distribusi OpenJDK.

### Usage
Berikut adalah langkah-langkah untuk menjalankan program ini:

1. **Clone atau Download Source Code**

   Pertama, download source code program ini melalui link GitHub atau dengan menggunakan perintah berikut (Pastikan Git sudah terinstall):

   ```
   git clone https://github.com/hisyam99/Modul3Tugas3
   ```

2. **Compile Kode**

   Buka terminal atau command prompt, arahkan ke direktori tempat kode sumber tersimpan,

   ```
   cd Modul3Tugas3/src/main/java
   ```

   dan jalankan perintah berikut untuk mengompilasi program:

   ```
   javac org/modul3/tugas/FibonacciIterative.java
   ```

3. **Menjalankan Program**

   Setelah berhasil mengompilasi program, jalankan program dengan perintah berikut:

   ```
   java org.modul3.tugas.FibonacciIterative
   ```

   Program akan meminta kita untuk memasukkan jumlah suku deret Fibonacci yang ingin dihitung. Masukkan angka yang sesuai dan tekan Enter.

4. **Hasil dan Waktu Eksekusi**

   Program akan menghitung deret Fibonacci hingga suku yang diinginkan dan menampilkan hasilnya di layar. Selain itu, program juga akan menampilkan waktu eksekusi dalam nanodetik (ns) yang diperlukan untuk perhitungan.

### Example
Berikut adalah contoh penggunaan program:

1. Menjalankan program:

   ```
   Masukkan jumlah suku deret Fibonacci: 10
   ```

2. Hasil yang ditampilkan:

   ```
   Perhitungan deret Fibonacci hingga suku ke 10
   Iteratif: Hasil = 55
   ```

### License

This project is licensed under the [MIT License](LICENSE).
