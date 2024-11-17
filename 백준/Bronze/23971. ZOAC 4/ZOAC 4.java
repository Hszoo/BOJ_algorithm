import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int h = Integer.parseInt(split[0]);
        int w = Integer.parseInt(split[1]);
        int n = Integer.parseInt(split[2]);
        int m = Integer.parseInt(split[3]);

        int rst1 = (h-1)/(n+1)+1;
        int rst2 = (w-1)/(m+1)+1;

        System.out.println(rst1*rst2);
 
    }
}
