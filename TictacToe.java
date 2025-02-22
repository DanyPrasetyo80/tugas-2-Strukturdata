public class TictacToe {
    public static void main(String[] args) {
        // Inisialisasi Papan Permainan
        char[][] papan = new char[3][3];
        // Mengisi Papan dengan Karakter kosong '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                papan[i][j] = '-';
            }
        }
        // Menempatkan Beberapa Tanda di Papan
        papan[0][0] = 'X';
        papan[1][1] = 'O';
        papan[2][2] = 'X';
        // Menampilkan Papan Permainan
        System.out.println("Status Papan: ");
        tampilkanPapan(papan);
    }

    // Metode tampilkanPapan() untuk Mencetak Papan
    public static void tampilkanPapan(char[][] papan) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
        }
    }

}

// ----Hasil-----
// X--
// -O-
// --X