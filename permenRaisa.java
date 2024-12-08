import java.util.Scanner;

public class permenRaisa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int[] peringkat = new int[n];
        for (int i = 0; i < n; i++) {
            peringkat[i] = inp.nextInt();
        }
        int[] permen = new int[n];
        for (int i = 0; i < n; i++) {
            permen[i] = 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (peringkat[i] > peringkat[i + 1]) {
                permen[i] = Math.max(permen[i], permen[i + 1] + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(permen[i] + " ");
        }
        int totalPermen = 0;
        for (int i = 0; i < n; i++) {
            totalPermen += permen[i];
        }
        System.out.println(totalPermen);
        
        inp.close();
    }
    
}
