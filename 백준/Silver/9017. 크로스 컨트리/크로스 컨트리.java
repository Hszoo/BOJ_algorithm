import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int tc = 0; tc < testcase; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] runners = new int[n + 1]; // index: 1~n

            // 팀 별 인원
            Map<Integer, Integer> cnt = new HashMap<>();
            // 팀 별 점수
            Map<Integer, Integer> team = new HashMap<>();
            // 팀 별 상위 5명 점수 기록
            Map<Integer, ArrayList<Integer>> teamScores = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                runners[i] = Integer.parseInt(st.nextToken());
                // 초기화
                cnt.putIfAbsent(runners[i], 0);
                cnt.put(runners[i], cnt.get(runners[i]) + 1);
                teamScores.putIfAbsent(runners[i], new ArrayList<>());
            }

            // 등수 별 점수 계산
            int sc = 1;
            for (int i = 1; i <= n; i++) {
                if (cnt.get(runners[i]) == 6) // 팀 인원 == 6
                    teamScores.get(runners[i]).add(sc++);
            }

            // 팀 별 점수 계산
            for (Map.Entry<Integer, ArrayList<Integer>> entry : teamScores.entrySet()) {
                int teamId = entry.getKey();
                ArrayList<Integer> scores = entry.getValue();

                if (scores.size() >= 4) { // 상위 4명
                    int sum = 0;
                    for (int i = 0; i < 4; i++)
                        sum += scores.get(i);
                    team.put(teamId, sum);
                }
            }

            int winner = -1;
            int minScore = Integer.MAX_VALUE;
            int minFifthScore = Integer.MAX_VALUE;

            for (int teamId : team.keySet()) {
                int score = team.get(teamId);
                ArrayList<Integer> scores = teamScores.get(teamId);

                if (score < minScore || (score == minScore && scores.get(4) < minFifthScore)) {
                    minScore = score;
                    minFifthScore = scores.get(4);
                    winner = teamId;
                }
            }

            // 결과 출력
            System.out.println(winner);
        }
    }
}
