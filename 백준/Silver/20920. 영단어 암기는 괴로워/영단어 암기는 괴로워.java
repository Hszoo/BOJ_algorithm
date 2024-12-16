
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        Map<String, Integer> wordCount = new HashMap<>(); // 단어, 빈도 저장

        for(int i=0; i<N; i++) {
            String word = br.readLine();

            // 단어 길이 M 이상
            if (word.length() >= M)
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> wordList = new ArrayList<>(wordCount.keySet());


        wordList.sort((w1, w2) -> {
            int freq1 = wordCount.get(w1);
            int freq2 = wordCount.get(w2);

            // 1. 자주 나오는 단어
            if (freq1 != freq2)
                return Integer.compare(freq2, freq1);

            // 2. 긴 단어
            if (w1.length() != w2.length()) {
                return Integer.compare(w2.length(), w1.length());
            }

            // 3. 사전 순
            return w1.compareTo(w2);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : wordList)
            sb.append(word).append("\n");
        
        // 결과 출력
        System.out.print(sb);
    }
}
