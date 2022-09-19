import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);

		if (B >= C) { // 손익분기점이 없는 경우 (비용쪽이 더 빨리 증가하기때문)
			System.out.println(-1);
		} else {
			System.out.println(A/(C-B)+1);
		}
	}
}