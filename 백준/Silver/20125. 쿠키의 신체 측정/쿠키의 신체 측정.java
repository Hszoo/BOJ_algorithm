import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] cookie = new String[N][N];

        for(int i = 0; i < N; i++) {
            String tmp = br.readLine();
            cookie[i] = tmp.split("");
        }

        // 심장 찾기
        int x, y = 0;
        int heartX = 0, heartY = 0;
        for(x = 1; x < N - 1; x++) {
            for(y = 1; y < N - 1; y++) {
                if (cookie[x][y].equals("*") && cookie[x+1][y].equals("*") &&
                        cookie[x][y-1].equals("*") && cookie[x][y+1].equals("*")) {
                    heartX = x;
                    heartY = y;
                    break;
                }

            }
        }

        // 신체 부위 길이 계산
        int armL = 0, armR=0, waist=0, legL=0, legR=0;

        // 왼쪽 팔길이
        for(int i = heartY-1; i >= 0; i--) {
            if(cookie[heartX][i].equals("_"))
                break;
            armL++;
        }

        // 오른쪽 팔길이
        for(int i = heartY+1; i < N; i++) {
            if(cookie[heartX][i].equals("_"))
                break;
            armR++;
        }

        // 허리 길이
        int tempX=0;
        for(int i = heartX+1; i < N; i++) {
            if(cookie[i][heartY].equals("_"))
                break;
            waist++;
            tempX = i;
        }

        // 왼쪽 다리길이
        if (heartY - 1 >= 0) {
            for (int i = tempX + 1; i < N; i++) {
                if (cookie[i][heartY - 1].equals("_"))
                    break;
                legL++;
            }
        }

        // 오른쪽 다리길이
        if (heartY + 1 < N) {
            for (int i = tempX + 1; i < N; i++) {
                if (cookie[i][heartY + 1].equals("_"))
                    break;
                legR++;
            }
        }

        // 결과 출력
        // 심장 위치 x, y 좌표 출력
        System.out.println((heartX+1) + " " + (heartY+1));
        System.out.println(armL + " " + armR + " " + waist + " " + legL + " " + legR);

        br.close();
    }
}
