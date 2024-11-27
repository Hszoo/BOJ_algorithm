import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String pw;
        char[] password;

        boolean flag;
        char prev;
        int count;

        String acc = "> is acceptable.\n";
        String not = "> is not acceptable.\n";

        while (!(pw = br.readLine()).equals("end")) {
            password = pw.toCharArray();
            prev = '.';
            count = 0;

            flag = false;
            for(char p : password) {
                if(isVowel(p)) flag = true;

                if(isVowel(p) != isVowel(prev)) count = 1;
                else count++;

                if (count > 2 || (prev == p && (p != 'e' && p != 'o'))) {
                    flag = false;
                    break;
                }

                prev = p;
            }

            if (flag) sb.append('<').append(password).append(acc);
            else sb.append('<').append(password).append(not);
        }

        System.out.println(sb);
    }

    public static boolean isVowel(char ch) {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
}
