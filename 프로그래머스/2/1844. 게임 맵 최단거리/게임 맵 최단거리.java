import java.util.*;

class Solution {
    int[][] mapStatic;
    int[] dx = {0, 1, 0, -1}; 
    int[] dy = {1, 0, -1, 0}; 
    int answer = -1;
    boolean[][] visited; 
    
    public int solution(int[][] maps) {
        mapStatic = maps;
        visited = new boolean[mapStatic.length][mapStatic[0].length];
        
        bfs(0,0);
        
        return answer;
    }
    
    class Pos {
        int x;
        int y;
        int dist;

        public Pos(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    void bfs(int x, int y) {
        Queue<Pos> queue = new LinkedList<>();
        queue.offer(new Pos(x, y, 1));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Pos node = queue.poll();
            
            for(int k = 0; k < 4 ; k++) { 
                int dr = dx[k] + node.x;
                int dc = dy[k] + node.y;
    
                if(dr < 0 || dc < 0 || dr > mapStatic.length - 1 || dc > mapStatic[x].length - 1) continue;
    
                if(!visited[dr][dc] && mapStatic[dr][dc] == 1) {
                    queue.offer(new Pos(dr, dc, node.dist + 1));    
                    visited[dr][dc] = true;
                }

                if(node.x == mapStatic.length - 1 && node.y == mapStatic[node.x].length - 1) {
                    answer = node.dist;
                }
            }
        }
    }
    
}