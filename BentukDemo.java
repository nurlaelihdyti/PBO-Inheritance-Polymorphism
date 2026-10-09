import java.util.Scanner;

public class BentukDemo {
    public static void main(String[] args) {
        // ===== BAGIAN 1 -> Latihan 1, 2, 3 =====

        BujurSangkar bs = new BujurSangkar(5, "merah");
        Lingkaran lk = new Lingkaran(7, "biru");
        Silinder sl = new Silinder(10, 7, "hijau");

        System.out.println("=== Latihan 1: BujurSangkar ===");
        bs.printInfo();
        bs.setSisi(8);
        bs.setWarna("kuning");
        System.out.println("Setelah diubah (sisi = " + bs.getSisi() + "):");
        bs.printInfo();

        System.out.println();
        System.out.println("=== Latihan 2: Lingkaran ===");
        lk.printInfo();
        lk.setRadius(10);
        System.out.println("Setelah diubah (radius = " + lk.getRadius() + "):");
        lk.printInfo();

        System.out.println();
        System.out.println("=== Latihan 3: Silinder ===");
        sl.printInfo();
        sl.setTinggi(20);
        System.out.println("Setelah diubah (tinggi = " + sl.getTinggi() + "):");
        sl.printInfo();

        // ===== BAGIAN 2 Polymorphism =====
        System.out.println();
        System.out.println("=== Polymorphism: satu array, banyak bentuk ===");
        Bentuk[] daftar = {
            new Bentuk("putih"),
            new BujurSangkar(4, "merah"),
            new Lingkaran(3, "biru"),
            new Silinder(5, 3, "hijau")
        };
        for (Bentuk b : daftar) {
            b.printInfo();
        }

        // ===== BAGIAN 3 Menu sederhana =====
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println();
            System.out.println("--- Menu Bentuk ---");
            System.out.println("1. Bujursangkar");
            System.out.println("2. Lingkaran");
            System.out.println("3. Silinder");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Sisi: ");
                    double sisi = input.nextDouble();
                    System.out.print("Warna: ");
                    String w1 = input.next();
                    new BujurSangkar(sisi, w1).printInfo();
                    break;
                case 2:
                    System.out.print("Radius: ");
                    double r = input.nextDouble();
                    System.out.print("Warna: ");
                    String w2 = input.next();
                    new Lingkaran(r, w2).printInfo();
                    break;
                case 3:
                    System.out.print("Tinggi: ");
                    double t = input.nextDouble();
                    System.out.print("Radius: ");
                    double r3 = input.nextDouble();
                    System.out.print("Warna: ");
                    String w3 = input.next();
                    new Silinder(t, r3, w3).printInfo();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 0);

        input.close();
    }
}