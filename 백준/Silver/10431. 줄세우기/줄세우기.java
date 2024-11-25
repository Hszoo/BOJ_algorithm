
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int P = Integer.parseInt(st.nextToken());
        int[] tc = new int[20];

        for (int i = 0; i < P; i++) {
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            int lineNum = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 20; j++)
                tc[j] = Integer.parseInt(st.nextToken());

            for (int k = 0; k < 20; k++) {
                for (int l = 0; l < k; l++) {
                    if(tc[k] < tc[l]){
                        cnt++;
                    }
                }
            }
            // 결과 출력
            System.out.println(lineNum + " " + cnt);

        }
    }
}



