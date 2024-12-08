import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan jumlah pemain yang mencetak score: ");
        int n = inp.nextInt();
        inp.nextLine();

        double totalPoin = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("Masukkan nama: ");
            String nm = inp.next();
            System.out.println("Masukkan FT, TW, dan TH secara berurutan: ");
            int FT = inp.nextInt();
            int TW = inp.nextInt();
            int TH = inp.nextInt();

            totalPoin = totalP(totalPoin, FT, TW, TH);

            System.out.println("Poin yang diperoleh " + nm + " adalah " + totalPoin);
        }
        double rata = rataRata(n, totalPoin);

            System.out.println("Rata-rata poin yang diperoleh seluruh pemain adalah: " + rata);
        inp.close();
    }
    static double totalP(double totalPoin, int FT, int TW, int TH) {
            totalPoin = FT + (TW*2) + (TH*3);
            return (double) totalPoin;
    }
    static double rataRata(int n, double totalPoin) {
        double rata = totalPoin / n;
        return rata;
    }
    
}
