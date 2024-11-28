import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        String game = split[1];

        Set<String> username = new HashSet<>();

        // user 입력
        for(int i = 0; i < N; i++)
            username.add(br.readLine());

        int count = 0;
        switch (game) {
            case "Y" :
                count = 2;
                break;
            case "F" :
                count = 3;
                break;
            case "O" :
                count = 4;
                break;
        }

        // 결과 출력
        System.out.println(username.size() / (count-1));

        br.close();
    }
}
