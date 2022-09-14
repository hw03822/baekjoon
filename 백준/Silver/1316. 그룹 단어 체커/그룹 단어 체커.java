
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt(); // testcase수 입력받기
		boolean check = true;// 문자인지 확인
		int count = 0;

		for (int i = 0; i < testCase; i++) { // testcase 하나에 대해
			boolean[] b = new boolean[26]; // 알파벳 중복체크(testcase마다 새로운배열이 생성되어야함)
			int prev = 0;//이전값역시 testcase마다 초기화해줘야함
			String s = scan.next();
			for (int j = 0; j < s.length(); j++) { // 입력받은 한개 문자에 대한 처리
				int now = s.charAt(j);
				if (prev != now) { // 앞에거랑 뒤에거 다르면
					if (b[now - 'a'] == false) {// false일때, 이전에 나온적 없음
						b[now - 'a'] = true;
						prev = now;// 이전꺼에 현재꺼를 넣어주면서 한칸씩 뒤로 당김
					} else { // true일때, 이전에 나온적 있음
						check = false; // 단어가 아님
						break;//단어가 아니면 더이상 확인할 필요X
					}
				} else {// 앞에꺼랑 뒤에꺼 같으면 prev == now
					continue; // 반복문계속하기
				}
				check = true;//중간에 break되지 않고 반복문끝까지 돌리면 문자임 
			} // 한문자에 대한 처리가 끝나면 문자인지 확인을 해줌
			if (check == true) {// true일때, 문자일때
				count++;
			}
		}
		System.out.println(count);
	}
}