import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] split = br.readLine().split(" ");
            int n1 = Integer.parseInt(split[0]);
            int n2 = Integer.parseInt(split[1]);
            int n3 = Integer.parseInt(split[2]);

            if (n1 == 0 && n2 == 0 && n3 == 0)
                break;

            int[] nums = {n1, n2, n3};
            Arrays.sort(nums); // 정렬
            int a = nums[0];
            int b = nums[1];
            int c = nums[2]; // 가장 긴 변
            
            if (a + b <= c) {
                System.out.println("Invalid");
            } else {
                // 삼각형 유형 판단
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }

    }
}
