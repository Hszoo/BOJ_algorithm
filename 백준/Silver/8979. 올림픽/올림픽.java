import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        int[][] countries = new int[N][4];

        for(int i=0; i<N; i++) {
            String[] split2= br.readLine().split(" ");
            countries[i][0] = Integer.parseInt(split2[0]);
            countries[i][1] = Integer.parseInt(split2[1]);
            countries[i][2] = Integer.parseInt(split2[2]);
            countries[i][3] = Integer.parseInt(split2[3]);
        }

        Arrays.sort(countries, (a, b) -> {
            // 금메달 개수 기준 정렬
            int gold = Integer.compare(b[1], a[1]);
            if (gold != 0) return gold;

            // 은메달 개수 기준 정렬
            int silver = Integer.compare(b[2], a[2]);
            if (silver != 0) return silver;

            // 동메달 개수 기준 정렬
            return Integer.compare(b[3], a[3]);
        });

        int cnt = 1;
        for(int z=0; z<N; z++) {
            if(countries[z][0] == K) {
                for(int x=0; x<z; x++) {
                    if (countries[x][1] > countries[z][1])
                        cnt++;

                    else if (countries[x][2] > countries[z][2])
                        cnt++;

                    else if (countries[x][3] > countries[x][3])
                        cnt++;
                }
                break;
            }

        }

        // 결과 출력
        System.out.println(cnt);


    }
}
