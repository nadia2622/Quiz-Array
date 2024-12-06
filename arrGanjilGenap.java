import java.util.Scanner;

public class arrGanjilGenap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen N: ");
        int n = inp.nextInt();
        
        System.out.println("Masukkan elemen KA: ");
        int[] KA = new int[n];
        for (int i = 0; i < n; i++) {
            KA[i] = inp.nextInt();
        }

        System.out.println("Masukkan elemen KB: ");
        int[] KB = new int[n];
        for (int i = 0; i < n; i++) {
            KA[i] = inp.nextInt();
        }

        System.out.println("Masukkan kriteria (ganjil/genap): ");
        String jenis = inp.next().toLowerCase();

        int hasil = jumlah(KA, KB, jenis);

        System.out.println("Hasil penjumlahan elemen " + jenis + " adalah " + hasil);
    }
    static int jumlah(int[] KA, int[] KB, String jenis) {
        int jumlah = 0;
        boolean isGenap = jenis.equals("genap");

        for (int i = 0; i < KA.length; i++) {
            if (isGenap) {
                if (KA[i] % 2 == 0) jumlah += KA[i];
                if (KB[i] % 2 == 0) jumlah += KB[i];
            } else {
                if (KA[i] % 2 != 0) jumlah += KA[i];
                if (KB[i] % 2 != 0) jumlah += KB[i];
            }
        }
        return jumlah;
    }
}
