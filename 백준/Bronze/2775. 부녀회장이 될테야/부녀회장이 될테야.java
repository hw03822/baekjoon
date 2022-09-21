import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[][] people = new int[15][15];
	public static void peopleSum() { //배열만들기
		for(int y=1;y<15;y++) {
			people[0][y] = y; // 0층 y호
		}
		
		for(int x=1;x<15;x++) { // 층 수(1층부터 14층까지)
			for(int y=1;y<15;y++) { //호 수 (1호부터 14호까지)
				people[x][y] = people[x][y-1] + people[x-1][y];
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bfr.readLine()); // 테스트케이스
		int count = 0;
		
		peopleSum();
		
		for(int i=0;i<T;i++) {
			int K = Integer.parseInt(bfr.readLine()); // 층 수
			int N = Integer.parseInt(bfr.readLine()); // 몇 호
			
			System.out.println(people[K][N]);
		}
	}
}
