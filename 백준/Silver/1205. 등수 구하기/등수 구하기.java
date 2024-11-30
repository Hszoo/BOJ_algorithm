import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        List<Integer> scores = new ArrayList<>();
        if (N > 0) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                scores.add(Integer.parseInt(st.nextToken()));
            }
        }

        scores.sort(Comparator.reverseOrder());

        // 순위 계산
        int rank = 1;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < score) {
                break;
            } else if (scores.get(i) > score) {
                rank++;
            }
        }

        // 결과 출력
        if (scores.size() >= P && scores.get(P-1) >= score) {
            System.out.println(-1);
        } else {
            System.out.println(rank);
        }
    }
}
