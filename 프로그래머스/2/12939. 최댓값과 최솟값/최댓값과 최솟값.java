class Solution {
    public String solution(String s) {
        String[] tmp = s.split(" ");
        int min = Integer.parseInt(tmp[0]);  
        int max = Integer.parseInt(tmp[0]);

        for (String num : tmp) {
            int n = Integer.parseInt(num);
            if (n < min) min = n;
            if (n > max) max = n;
        }

        return min + " " + max;
    }
}