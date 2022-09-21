import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bfr.readLine()); // 테스트케이스
		
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(bfr.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int Y = N % H; //층수 (H층수까지 올라가고 나머지 생기면 다음층에서 그만큼 올라가야함 => 층 수)
			int X = N/H + 1; // 호 수 (H층까지 몇번올라가야하는지 => 몫, (1층이 꽉차면 2층으로 넘어가야함 => +1))
			if(Y == 0) { // 꼭대기층
				Y = H;
				X -= 1;
			}
			System.out.println(Y*100+X);
			
		}
	}
}
