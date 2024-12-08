import java.util.*;

public class warna {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashMap<String, Integer> warna = new HashMap<>();
        warna.put("merah", 0);
        warna.put("abu", 0);
        warna.put("hitam", 0);

        while(true) {
            String input = inp.nextLine();
            if(input.equals("-1")){
                break;
            }

            if(warna.containsKey(input)){
                warna.put(input, warna.get(input) + 1);
            } else {
                System.out.println("warna mboten valid. monggo input 'merah', 'abu', lan 'hitam' mawon");
            }
        }
        String dominan = null;
        int maxCount = -1;

        for (String jenis : warna.keySet()) {
            int count = warna.get(jenis);
            if (count > maxCount) {
                maxCount = count;
                dominan = jenis;
            }
        }
        System.out.println("mobil terbanyak : " + dominan);

        inp.close();

    }
}
