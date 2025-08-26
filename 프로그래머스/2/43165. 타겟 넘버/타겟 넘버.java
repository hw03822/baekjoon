class Solution {
    
    static int[] numberStatic;
    static int targetStatic;
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        numberStatic = numbers;
        targetStatic = target;
        
        dfs(0, numberStatic[0]);
        dfs(0, -numberStatic[0]);
        
        return answer;
    }
    
    static void dfs(int depth, int currentNum) {
        if (depth == numberStatic.length - 1) {
            if(targetStatic == currentNum) {
                answer++;
            }
            return;
        }
        
        dfs(depth + 1, currentNum + numberStatic[depth + 1]);
        dfs(depth + 1, currentNum - numberStatic[depth + 1]);
    }
}