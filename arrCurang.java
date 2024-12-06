import java.util.*;

public class arrCurang {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Silahkan masukkan jumlah nilai sesi 1");
        int a = inp.nextInt();
        int[] nilai1 = new int[a];

        System.out.println("Silahkan masukkan jumlah nilai sesi 2");
        int b = inp.nextInt();
        int[] nilai2 = new int[b];


        if ((nilai1.length + nilai2.length) % 2 == 0) {
            System.out.println("Silahkan masukkan nilai sesi 1:");
            double rataRata1 = rataRata(nilai1, inp);

            System.out.println("Kemudian, silahkan masukkan nilai sesi 2: ");
            double rataRata2 = rataRata2(nilai2, inp);

            System.out.printf("Rata rata sesi 1 : %.2f%n", rataRata1);
            System.out.printf("Rata rata sesi 2 : %.2f%n", rataRata2);
            deteksiKecurangan(rataRata1, rataRata2);


        } else {
            System.out.println("Jumlah Array Invalid !!!");
        }

    }

    static double rataRata(int[] nilai1, Scanner inp) {
        int total1 = 0;
        for (int i = 0; i < nilai1.length; i++) {
            nilai1[i] = inp.nextInt();
            total1 += nilai1[i];
        }

        double rataRata1 = (double) total1 / nilai1.length;
        System.out.println("nilai rata-rata sesi 1: " + rataRata1);
        return (double) total1 / nilai1.length;
    }
        

    static double rataRata2(int[] nilai2, Scanner inp) {
        int total2 = 0;
        for (int i = 0; i < nilai2.length; i++) {
            nilai2[i] = inp.nextInt();
            total2 += nilai2[i];
        }
        double rataRata2 = (double) total2 / nilai2.length;
        System.out.println("nilai rata-rata sesi 1: " + rataRata2);
        return (double) total2 / nilai2.length;
    }
    static void deteksiKecurangan(double rataRata1, double rataRata2) {
        double selisih = Math.abs(rataRata1 - rataRata2);

        if (selisih > 20) {
            System.out.println("Kemungkinan terjadi kecurangan\n");
        } else {
            System.out.println("Tidak terjadi kecurangan\n");
        }
    }
}
