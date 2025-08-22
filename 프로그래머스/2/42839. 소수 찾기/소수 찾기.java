import java.util.*;

class Solution {
    
    static String numbersCopy;
    static int[] arrNum;
    static ArrayList<Integer> ret;
    static HashSet<Integer> retSet;
    static StringBuilder retString;
    static boolean[] sel;
    
    public int solution(String numbers) {
        int answer = 0;
        
        numbersCopy = numbers;
        arrNum = new int[numbersCopy.length()];
        ret = new ArrayList<>();
        retSet = new HashSet<>();
        retString = new StringBuilder();
        sel = new boolean[arrNum.length];
        
        for(int i = 0; i < numbersCopy.length(); i++){
            arrNum[i] = numbersCopy.charAt(i) - '0';
        }

        permutation(0);

        // System.out.println(retSet);

        // 1과 자신 -> 소수
        boolean isPrime = true;
        for(int setItem:retSet) {
            isPrime = true;
            for(int i = 2; i < setItem; i++) {
                if (setItem % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(setItem != 0 && setItem != 1 && isPrime) {
                answer++;    
            }
        }
        
        return answer;
    }
    static void permutation(int depth) {
        if(depth == arrNum.length){
            // System.out.println(retString);
            // retSet.add(Integer.parseInt(retString.toString()));
            return;
        }

        for(int i=0;i<arrNum.length;i++){
            if(sel[i]) continue;
            sel[i] = true;
            retString.append(arrNum[i]);
            retSet.add(Integer.parseInt(retString.toString()));
            permutation(depth+1);
            retString.deleteCharAt(retString.length()-1);
            sel[i] = false;
        }
    }
}