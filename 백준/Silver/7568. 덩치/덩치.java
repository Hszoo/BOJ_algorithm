import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);

        int[][] info = new int[N][2];

        for(int i = 0; i < N; i++) {
            String[] split2= br.readLine().split(" ");
            info[i][0] = Integer.parseInt(split2[0]); // 몸무게
            info[i][1] = Integer.parseInt(split2[1]); // 키
        }

        for(int j = 0; j < N; j++) {
            int rank = 1;
            for (int z = 0; z < N; z++) {
                if (j != z && info[j][0] < info[z][0] && info[j][1] < info[z][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
