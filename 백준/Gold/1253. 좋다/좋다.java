import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수의 개수
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[N];
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);//뒤죽박죽으로 들어올 수 있으므로 정렬
		
		for(int k=0;k<N;k++) {
			int find = num[k]; // 모든 수를 기준K로 한번씩지정해야함
			int j = N-1; // 배열을 정렬 했으니 다른 두 수의 합이 되려면 k보다 앞에 값을 최대로 지정(k-1) -> 음의 정수 때문에 안됨
			int i = 0;
			
			while(i<j) { //i와 j가 같아지면 좋은수가 아니라는뜻 (더해도 k와 같아지는 수가 없으니까)
				if(num[i]+num[j]==find) {
					if(i!=k && j!=k) { //다른 두 수의 합이여야하기 때문에 i와j가 같으면 안됨
						count++;
						break; // 좋은 수가 되었으니 for문으로 돌아감
					}else if(i==k) {
						i++; //다음으로 넘어감
					}else if(j==k) {
						j--; //다음으로 넘어감
					}
				}else if(num[i]+num[j]>find) { //두개의 합이 크다면
					j--; //최댓값을 작게
				}else if(num[i]+num[j]<find) { //기준인 K가 크다면
					i++; //최소값을 크게
				}
			}
		}
		System.out.println(count);
	}
}
