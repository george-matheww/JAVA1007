import java.util.*;
public class ranklist {
    ArrayList<ArrayList<String>> rl = new ArrayList<>();
    ArrayList<String> candidates = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public int v, c;

    public ranklist(int a, int b, String[] arr) {
        v = a;
        c = b;
        for (int i = 0; i < v; i++)
            rl.add(new ArrayList());
        int ci = 0;
        for (int i = 0; i < v; i++)
            for (int j = 0; j < c; j++)
                rl.get(i).add(arr[ci++]);
    }
    public String calc() {
        candidates = rl.get(0);
        int maj = 0;
        String m = "z";
        while (maj < (c / 2)) {
            int count[] = new int[c];
            for (int i = 0; i < c; i++)
                count[i] = 0;
            for (int i = 0; i < v; i++) {
                count[candidates.indexOf(rl.get(i).get(0))]++;
            }
            int min = 1000;
            String mc = "z";
            for (int i = 0; i < c; i++) {
                if (count[i] > (v / 2)) {
                    maj = count[i];
                    m = candidates.get(i);
                    break;
                } else {
                    if (count[i] < min) {
                        min = count[i];
                        mc = candidates.get(i);
                    }
                }
            }
            if (mc != "z") {
                candidates.remove(mc);
                for (int i = 0; i < v; i++)
                    rl.get(i).remove(mc);
                c--;
            }
        }
        return (m);
    }
}
