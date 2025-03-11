import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i=0; i<len; i++) {
            answer += A[i] * B[len-i-1];   
        }

        return answer;
    }
}