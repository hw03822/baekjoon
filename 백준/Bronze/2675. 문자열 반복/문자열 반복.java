import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = Integer.parseInt(scan.nextLine()); //testCase 수
		
		for(int i=0;i<testCase;i++) { //testCase수만큼 반복
			String[] str = scan.nextLine().split(" ");
			int R = Integer.parseInt(str[0]); //반복할 횟수
			String S =str[1];//반복할 문자
			
			for(int j=0;j<S.length();j++) { //문자열의 수만큼 반복
				for(int k=0;k<R;k++) {
					System.out.print(S.substring(j, j+1)); 
					//잘라낸거 R만큼 반복
				}
			}
			System.out.println();
		}
	}
}