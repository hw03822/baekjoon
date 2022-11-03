import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()); // 수의 개수
		int M = Integer.parseInt(st.nextToken()); // 합을 구해야하는 횟수
		
		int[] num = new int[N+1]; //수 배열
		int[] totalNum = new int[N+1]; //수를 더한 배열
		
		st = new StringTokenizer(bf.readLine()); // 입력받은 수를 공백기준으로 나눔
		for(int i=1;i<=N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
			totalNum[i] = totalNum[i-1] + num[i]; // 이전까지의 합과 현재 수 더하기
		}
		
        // 합 구해야하는 구간 i와 j 입력받기
		for(int k=0;k<M;k++) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int sum = totalNum[j] - totalNum[i-1];
			System.out.println(sum);
		}
		
	}
}