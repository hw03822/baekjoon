class Solution {
    static String[][] parkCopy;
    static int answer = -1;
    
    public int solution(int[] mats, String[][] park) {
        parkCopy = new String[park.length][park[0].length];
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length; j++) {
                parkCopy[i][j] = park[i][j];
            }
        }
        
         for(int i = 0; i < mats.length; i++) {
            for(int m = 0; m < parkCopy.length; m++) {
                for(int n = 0; n < parkCopy[m].length; n++) {
                    if(parkCopy[m][n].equals("-1")){
                        if(check(n, m, mats[i])){
                            if(answer == -1 || answer < mats[i]) {
                                answer = mats[i];
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
    private static boolean check(int posX, int posY, int mats) {
        for(int y = posY; y < posY + mats; y++) {
            for(int x = posX; x < posX + mats; x++) {
                if(y > parkCopy.length - 1 || x > parkCopy[posY].length - 1 || !parkCopy[y][x].equals("-1")){
                    return false;
                }
            }
        }
        
        return true;
    }
}