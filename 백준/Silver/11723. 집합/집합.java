

import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        // 반복 횟수
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // 입력
            String input = br.readLine();
            // 명령어, 숫자 split
            String[] parts = input.split(" ");

            String command = parts[0];

            switch (command) {
                case "add":
                    set.add(Integer.parseInt(parts[1]));
                    break;

                case "remove" :
                    set.remove(Integer.parseInt(parts[1]));
                    break;

                case "check":
                    if (set.contains(Integer.parseInt(parts[1]))) { // 존재하는 경우
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;

                case "toggle":
                    int searchNum = Integer.parseInt(parts[1]);
                    if(set.contains(searchNum)) { // 존재하는 경우
                        set.remove(searchNum);
                    } else {
                        set.add(searchNum);
                    }
                    break;

                case "all":
                    set.clear(); // 비우기
                    for (int k = 1; k <= 20; k++) {
                        set.add(k);
                    }
                    break;

                case "empty":
                    set.clear();
                    break;

                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
