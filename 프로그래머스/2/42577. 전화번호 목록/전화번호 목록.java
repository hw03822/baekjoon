import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashSet<String> hashSet = new HashSet<>();
        for(String phoneBookItem : phone_book) {
            hashSet.add(phoneBookItem);
        }
        
        for(String phoneBookItem : phone_book) {
            for(int j = 0; j < phoneBookItem.length(); j++) {
                if(hashSet.contains(phoneBookItem.substring(0, j))) {
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
        
    }
}