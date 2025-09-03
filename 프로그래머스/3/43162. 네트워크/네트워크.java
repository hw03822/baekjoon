import java.util.*;

class Solution {
    List<List<Integer>> graph = new ArrayList<>();
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[computers.length];
        
        for(int i = 0; i < computers.length; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers.length; j++){
                if(computers[i][j] == 1) {
                    graph.get(i).add(j);
                }
            }
        }
        
        for(int i = 0; i < computers.length; i++) {
            if(!visited[i]) {
                bfs(i);
                answer++;
            }
        }
        return answer;
    }
    
    void bfs(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        visited[index] = true;
        
        while (!queue.isEmpty()) {
            int head = queue.poll();
            for(int next : graph.get(head)) {
                if(!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
    }
}