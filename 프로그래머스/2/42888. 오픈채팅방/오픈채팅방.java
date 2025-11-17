import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        
        HashMap<String, String> hashMap = new HashMap<>();
        String[] strSplit = {};
        for(int i = 0; i < record.length; i++) {
            strSplit = record[i].split(" ");

            if(strSplit[0].equals("Enter") || strSplit[0].equals("Change")) {
                hashMap.put(strSplit[1], strSplit[2]);
            }

        }

        ArrayList<String> arrList = new ArrayList<>();
        for(int i = 0; i < record.length; i++) {
            strSplit = record[i].split(" ");

            if(strSplit[0].equals("Enter")) {
                arrList.add(hashMap.get(strSplit[1]) + "님이 들어왔습니다.");
            } else if(strSplit[0].equals("Leave")) {
                arrList.add(hashMap.get(strSplit[1]) + "님이 나갔습니다.");
            }
        }

        answer = new String[arrList.size()];
        for(int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
    
        return answer;
    }
}