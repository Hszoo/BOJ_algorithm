import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pw;
        String status;

        /* 3조건 모두 만족해야 acceptable */
//        모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
//        모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
//        같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.

        while (true) {
            pw = br.readLine();

            if (pw.equals("end")) {
                break; 
            }

            if (check1(pw) && check2(pw) && check3(pw)) {
                status = "acceptable.";
            } else {
                status = "not acceptable.";
            }

            System.out.println("<" + pw + "> is " + status);
        }

    }

    public static boolean check1(String s) {
        // 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.

        char[] conditions = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < conditions.length; i++) {
            // acceptable
            if (s.contains(String.valueOf(conditions[i])))
                return true;
        }

        // not acceptable
        return false;
    }

    public static boolean check2(String s) {
        // 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.

        String conditions = "aeiou"; // 모음
        int vowelCount = 0; // 연속된 모음 개수
        int consonantCount = 0; // 연속된 자음 개수

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (conditions.indexOf(c) != -1) { // 모음
                vowelCount++;
                consonantCount = 0; // 자음 카운트 초기화
            } else if (Character.isLetter(c)) { // 자음
                consonantCount++;
                vowelCount = 0; // 모음 카운트 초기화
            } else {
                vowelCount = 0;
                consonantCount = 0; // 문자가 모음, 자음이 아니면 초기화
            }

            // not acceptable
            if (vowelCount == 3 || consonantCount == 3)
                return false;
        }

        // acceptable
        return true;
    }

    public static boolean check3(String s) {
        // 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i); // 현재 문자
            char prev = s.charAt(i - 1); // 이전문자

            // not acceptable
            if (prev == curr && !(prev == 'e' && curr == 'e') && !(prev == 'o' && curr == 'o'))
                return false;
        }

        // acceptable
        return true;
    }
}
