import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1; // 자기자신 포함해서 1로 초기화
		int start_index = 1; // 시작 포인터 초기화
		int end_index = 1; // 끝 포인터 초기화
		int sum = 1; // N과 비교할 현재 총합
		
		while(end_index != N) { //end_index가 N이 될 때까지 반복
			if(sum == N) {
				count++; // 같아서 경우의 수 추가
				end_index++; //옆으로 이동하기 위한 작업
				sum += end_index;
			}else if(sum > N) {
				sum -= start_index; // 현재 start_index는 포함이 안되기 때문에 먼저 뺀다음
				start_index++; // +1
			}else if(sum < N) {
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
	}
}
