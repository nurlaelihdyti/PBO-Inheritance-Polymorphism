# Program Bentuk: Inheritance dan Polymorphism

**Tugas Pemrograman Berorientasi Objek (PBO)**

- NIM : F1D02510129
- Nama : NURLAELI HIDAYATI

## Deskripsi
Program bentuk geometri dengan class Bentuk, BujurSangkar, Lingkaran, dan Silinder.
Dilengkapi menu sederhana memakai Scanner.

## Struktur Class
Bentuk
 ├── BujurSangkar
 └── Lingkaran
       └── Silinder

## Encapsulation
Atribut dibuat private (sisi, radius, tinggi) sehingga hanya bisa diakses lewat
getter dan setter, misalnya getSisi(), setSisi(), getRadius(), setRadius(),
getTinggi(), setTinggi(). Atribut warna dibuat protected agar bisa dipakai class
turunan, dan tetap dapat diubah lewat getWarna() dan setWarna().

## Inheritance
- BujurSangkar extends Bentuk
- Lingkaran extends Bentuk
- Silinder extends Lingkaran

Class turunan memakai super(...) untuk memanggil constructor class induknya.
Atribut radius bersifat private di Lingkaran, sehingga Silinder tidak mengaksesnya
secara langsung. Silinder memakai getRadius() dan hitungLuas() yang diwarisi
dari Lingkaran, serta atribut warna (protected) dari Bentuk.

## Polymorphism
Method printInfo() di-override pada setiap class turunan sehingga menampilkan
teks yang berbeda. Pada BentukDemo, array bertipe Bentuk berisi berbagai objek.
Saat printInfo() dipanggil dalam perulangan, versi method yang berjalan
mengikuti objek aslinya (runtime polymorphism / overriding).

## Cara Menjalankan
1. Pastikan JDK sudah terpasang.
2. Kompilasi: `javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java BentukDemo.java`
3. Jalankan: `java BentukDemo`

## Library Tambahan
Tidak ada. Hanya memakai java.util.Scanner bawaan Java.

## Screenshot Hasil
<img width="393" height="570" alt="hasil1" src="https://github.com/user-attachments/assets/08fbc942-cf4e-4a63-97be-8184c7f4f0fe" />


->

<img width="412" height="515" alt="hasil2" src="https://github.com/user-attachments/assets/d6a3658f-d032-4db0-a357-e873415098ac" />


