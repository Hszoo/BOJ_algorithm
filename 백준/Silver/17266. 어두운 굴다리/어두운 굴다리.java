import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 굴다리 길이
        int M = Integer.parseInt(br.readLine()); // 가로등 개수

        int[] position = new int[N+1]; // 굴다리 위치 별 가로등 유무
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(input[i]);
            position[num] = 1;
        }

        int prev_idx = 0; // 이전 가로등 위치
        int height = -1;
        int tmp_height;
        for(int i = 0; i <= N; i++) {
            if(position[i] == 1) {
                if(position[prev_idx] == 1) {
                    tmp_height = i - prev_idx;
                    if(tmp_height % 2 == 0)
                        tmp_height = (i - prev_idx) / 2;
                    else
                        tmp_height = (i - prev_idx) / 2 + 1;
                }
                else
                    tmp_height = (i - prev_idx);

                height = Math.max(height, tmp_height);
                prev_idx = i;

            }
            if(i == N) {
                tmp_height = N - prev_idx;
                height = Math.max(height, tmp_height);
            }
        }

        // 결과 출력
        System.out.println(height);
    }
}
