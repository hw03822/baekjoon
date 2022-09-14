import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine().trim(); 
		//앞뒤공백제거 -> isEmpty() 사용시 true가 나옴
		
		if(S.isEmpty()) {
			System.out.println('0');
		}else {
			String[] str = S.split(" ");//공백으로 단어 자르기
			System.out.println(str.length);
		}
	}
}
