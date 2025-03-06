import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> nicknames = new HashMap<>();
        List<String> logs = new ArrayList<>();
        String[] answer = {};
        
        for(String s : record) {
            String[] tmp = s.split(" ");
            String comm = tmp[0];
            String uid = tmp[1];
            
            if(comm.equals("Enter")) {
                String nick = tmp[2];
                nicknames.put(uid, nick);
                logs.add(uid + " " + comm);
            } else if(comm.equals("Change")) {
                String nick = tmp[2];
                nicknames.put(uid, nick); // 변경 
            } else if (comm.equals("Leave")) {
                logs.add(uid + " " + comm);
            }
        }
        
        // 결과 기록
        List<String> result = new ArrayList<>();
        for(String l : logs) {
            String[] tmp = l.split(" ");
            String uid = tmp[0];
            String nickname = nicknames.get(uid);
            String comm = tmp[1];
            
            if(comm.equals("Enter")) {
                result.add(nickname + "님이 들어왔습니다.");
            } else if (comm.equals("Leave")) {
                result.add(nickname + "님이 나갔습니다.");
            }
        }
        answer = result.toArray(new String[result.size()]);
        
        return answer;
    }
}