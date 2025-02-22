public class SystemNilai {
    public static void main(String[] args) {
        // iDATA SISWA
        String[] namaSiswa = { "Ani", "Budi", "Cici", "Dodi", "Edi" };
        int[][] nilai = {
                { 80, 85, 90 }, // NILAI ANI
                { 75, 70, 85 }, // NILAI BUDI
                { 85, 80, 88 }, // NILAI CICI
                { 90, 85, 95 }, // NILAI DODI
                { 70, 75, 80 }, // NILAI EDI
        };
        String[] mapel = { "Matematika", "Bahasa Inggris", "IPA" };

        System.out.println("Rata-rata nilai per siswa");
        for (int i = 0; i < nilai.length; i++) {
            double total = 0;
            for (int n : nilai[i]) {
                total += n;
            }
            double rataSiswa = total / nilai[i].length;
            System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa);
        }

        System.out.println("\nRata-rata nilai pertama pelajaran:");
        for (int j = 0; j < nilai[0].length; j++) {
            double total = 0;
            for (int i = 0; i < nilai.length; i++) {
                total += nilai[i][j];
            }
            double rataMapel = total / nilai.length;
            System.out.printf("%s: %.2f\n", mapel[j], rataMapel);
        }
    }
}