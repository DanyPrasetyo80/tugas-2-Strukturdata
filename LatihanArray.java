public class LatihanArray {

    public static void main(String[] args) {
        // membuat array dengan 11 bilangan bulat
        int[] bilanganGanjil = new int[11];
        // inisialisasi variabel
        int jmlh = 0;
        // mengisi array dengan bilangan ganjil yang diawali dari angka 3
        for (int i = 0; i < bilanganGanjil.length; i++) {
            bilanganGanjil[i] = (i + 1) * 3;

        }
        // Menampilkan isi array
        System.out.print("Isi Array: ");
        for (int bilangan : bilanganGanjil) {
            System.out.print(bilangan + " ");
        }
        System.out.println();
        // menghitung jumlah elemen pada Array
        for (int bilangan : bilanganGanjil) {
            jmlh += bilangan;
        }
        // menampilkan hasil jumlah
        System.out.println("Jumlah Semua Elemen Array" + jmlh);
    }
}

// -----HASIL PROGAM-----
// Isi Array : 3 6 9 12 15 18 24 27 30
// Jumlah Semua Elemen Array165

// -----PENJELASAN-----
// 1. Array bilanganGanjil berisi kelipatan 3 dari 3 sampai 30
// 2. Jumlah dari semua elemen dalam array tersbut adalah 3 + 3 + 6 + 9 + 12 +
// 15 + 18 + 21 + 24 + 30 = 165