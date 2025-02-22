public class StatisticArray {
    public static void main(String[] args) {
        // Inisialisasi Array
        int[] nilai = { 75, 80, 65, 90, 85, 70, 95, 88 };
        // Mengecek apakah Array kosong
        if (nilai.length == 0) {
            System.out.println("Array nilai kosong");
            return;
        }
        // Inisialisasi variabel statistik
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int total = 0;
        // Loop untuk menentukan statistik
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi)
                tertinggi = nilai[i];
            if (nilai[i] < terendah)
                terendah = nilai[i];
            total += nilai[i];
        }
        // Menghitung rata-rata
        double ratRata = (double) total / nilai.length;
        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Rata-rata: " + String.format("%.2f", ratRata));

    }
}