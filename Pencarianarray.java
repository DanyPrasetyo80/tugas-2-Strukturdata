public class Pencarianarray {
    public static void main(String[] args) {
        // progam mencari nilai dalam array
        int[] nilai = { 75, 80, 65, 90, 85, 70, 95, 88 };
        int cari = 85;
        boolean bertemu = false;
        int indeks = -1;
        // mencari nilai
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                bertemu = true;
                indeks = i;
                break;
            }
        }
        // menampilkan hasil pencarian
        if (bertemu) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
        } else {
            System.out.println(" Nilai " + cari + " tidak ditemukan");

        }

    }
}

// -------HASIL-----
// NILAI 85 DITEMUKAN PADA INDEK 4
// {75, 80, 65, 90, 85, 70, 95, 88}