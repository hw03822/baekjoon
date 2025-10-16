import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] copyArr;
        int[] answer = new int[queries.length];
        int min = -1;

        for(int i = 0; i < queries.length; i++) {
                int s = queries[i][0];
                int e = queries[i][1];
                int k = queries[i][2];

                copyArr = Arrays.copyOfRange(arr, s, e+1);

                for(int n = 0; n < copyArr.length; n++){
                    if (k < copyArr[n] && (min == -1 || min > copyArr[n])) {   
                        min = copyArr[n];
                    }
                }
            answer[i] = min;
            min = -1;
        }
        
        return answer;
    }
}