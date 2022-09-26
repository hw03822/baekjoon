//소수(1과 자기자신으로 나누어떨어지는) 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bfr.readLine());//주어진 수의 개수
		StringTokenizer st = new StringTokenizer(bfr.readLine());//입력받은 한줄을 공백기준으로 자르기
		int count2 = 0;// 소수개수 합산
		
		for(int i=0;i<N;i++) {
			int count = 0; // 몇개로 나누어떨어지는지
			int a = Integer.parseInt(st.nextToken());
			for(int j=1;j<=a;j++) {//2부터 자기자신까지
				if(a % j == 0) { // 나누어떨어지는 경우
					count++; // count세기
				}
			}
			if(count == 2) { // count수가 2이면 소수
				count2++;
			}
		}
		System.out.println(count2);
	}
}
