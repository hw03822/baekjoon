import java.util.*;
    
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] dayCount = new int[progresses.length];
        int day = 1;
        int count = 1;

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++){
            day = 1;
            while(true) {
                if(progresses[i] + speeds[i] * day >= 100) {
                    dayCount[i] = day;
                    queue.add(day);
                    break;
                }
                day++;
            }
        }
    
        // System.out.println(Arrays.toString(dayCount));
        // System.out.println(queue);

        int head = 0;
        ArrayList<Integer> resultList = new ArrayList<>();
        while(!queue.isEmpty()) {
            count = 1;
            head = queue.peek();
            queue.poll();
            while (!queue.isEmpty()) {
                if(head >= queue.peek()) {
                    queue.poll();
                    count++;
                } else {
                    break;
                }
            }
            resultList.add(count);
        }

        // System.out.println(resultList);

        // ArrayList -> int[] 
        answer = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}