import java.util.*;

class Solution {
    
    String[][] ticketsCopy;
    ArrayList<String> list = new ArrayList<>();
    boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        ticketsCopy = tickets;
        visited = new boolean[ticketsCopy.length]; 
        
        dfs(0, "ICN", "ICN");
        
        Collections.sort(list);
        answer = list.get(0).split(" ");
        
        return answer;
    }
    
    void dfs(int depth, String start, String path) {
        if(depth == ticketsCopy.length){
            list.add(path);
            return;
        }
        
        for(int i = 0; i < ticketsCopy.length; i++){
            if(!visited[i] && start.equals(ticketsCopy[i][0])){
                visited[i] = true;
                dfs(depth+1, ticketsCopy[i][1], path + " " + ticketsCopy[i][1]);
                visited[i] = false;
            }
        }
    }
}