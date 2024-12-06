import java.util.Scanner;

public class permen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan 10 angka tingkat kemanisan");
        int[] manis = new int[10];

        permen(manis, inp);
    }

    static int permen (int[] manis, Scanner inp) {
        int total = 0;
        for (int i = 0; i < manis.length; i++) {
            manis[i] = inp.nextInt();
            total += manis[i];
        }
        int rataRata = total / manis.length;
        System.out.println("Rata-rata tingkat kemanisan: " + rataRata);
        return total / manis.length;
    }   
}
