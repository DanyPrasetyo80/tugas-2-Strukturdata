public class OperasiMatriks {

    public static void main(String[] args) {
        // Deklarasi matriks A dan B
        int[][] matriksA = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] matriksB = {
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        // Deklarsi matriks hasil
        int[][] hasil = new int[2][3];
        // Proses penjumlahan matriks
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[0].length; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlaha matriks:");
        for (int[] baris : hasil) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");

            }
            System.out.println();
        }

    }
}

// Hasil penjumlahan matriks:
// 8 10 12
// 14 16 18