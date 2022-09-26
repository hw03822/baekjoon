import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(bfr.readLine());//설탕 키로수
      int count = 0; //옮길 봉지 수
      
      while(true) {
         if(N % 5 == 0) {
            count += (N/5);
            System.out.println(count);
            break;
         }else{
            N -= 3;
            count++;
         }
         
         if(N<0){
            System.out.println("-1");
            break;
         }
      }
   }
}