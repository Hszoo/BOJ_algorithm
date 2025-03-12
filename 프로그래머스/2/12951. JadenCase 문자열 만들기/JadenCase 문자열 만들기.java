class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        boolean firstWord = true;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer.append(ch);
                firstWord = true;
            } else {
                if (firstWord) {
                    answer.append(Character.toUpperCase(ch));
                    firstWord = false;
                } else {
                    answer.append(Character.toLowerCase(ch));
                }
            }
        }
        
        return answer.toString();
    }
}
