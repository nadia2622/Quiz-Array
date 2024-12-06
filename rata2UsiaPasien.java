import java.util.Scanner;

public class rata2UsiaPasien {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Silahkan masukkan jumlah pasien: ");
        int a = inp.nextInt();
        int[] usia = new int[a];

        rata2(usia, inp);
    }
    static void rata2(int[] usia, Scanner inp) {
        int total = 0;
        for (int i = 0; i < usia.length; i++) {
            usia[i] = inp.nextInt();
            total += usia[i];
        }

        int rataRata = total / usia.length;
        System.out.println("Rata-rata usia pasien: " + rataRata);
    }
}
