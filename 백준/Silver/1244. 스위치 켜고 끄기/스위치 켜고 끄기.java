import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] lights;
    static int n;

    public static void main(String[] args) throws IOException {
        int stu_n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 전구 개수

        lights = new int[n+1]; // index : 1~n
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++)
            lights[i] = Integer.parseInt(st.nextToken());

        stu_n = Integer.parseInt(br.readLine()); // 학생 수

        for(int i=0; i<stu_n; i++) {
            String[] student = br.readLine().split(" ");

            int gender = Integer.parseInt(student[0]);
            int number = Integer.parseInt(student[1]);

            if(gender == 1)  // 남학생
                man_switch(number);
            else
                woman_switch(number);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(lights[i]).append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void man_switch(int number) {
        int tmp = number;
        while(tmp <= n) {
            lights[tmp] = lights[tmp] == 0 ? 1 : 0;
            tmp += number;
        }
    }
    public static void woman_switch(int number) {
        lights[number] = lights[number] == 0 ? 1 : 0; // 현재 스위치

        int z = 1;
        while (number - z >= 1 && number + z <= n) { // 대칭 가능 여부
            if (lights[number - z] != lights[number + z]) // 대칭X
                return;
            // 대칭
            lights[number - z] = lights[number - z] == 0 ? 1 : 0;
            lights[number + z] = lights[number + z] == 0 ? 1 : 0;
            z++;
        }
    }
}
