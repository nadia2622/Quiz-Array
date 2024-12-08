import java.util.Scanner;

public class ramuanElixir {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Silahkan masukkan jumlah lemari: ");
            int n = inp.nextInt();

            for(int i = 1; i <= n; i++){
                int DM = inp.nextInt();
                int M = inp.nextInt();
                int x = inp.nextInt();
                int y = inp.nextInt();

                jumlah(DM,x,M,y,i);
            }
        }
    }
    static int jumlah(int DM, int x, int M, int y, int i) {
        int Ramuan = Math.min(DM / x, M / y);
        System.out.println("total ramuan yang berhasil dibuat dari lemari persediaan " + i + " sebanyak: " + Ramuan);
        return Ramuan;
    }   
}
