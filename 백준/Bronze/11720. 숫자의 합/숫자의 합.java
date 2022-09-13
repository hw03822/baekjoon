import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());//숫자의 개수
		String str = scan.nextLine();//공백없이 숫자주어짐
		int sum = 0;
		
		for(int i=0;i<num;i++) {
			String a = str.substring(i, i+1);//substring(a,b) : a부터 b-1까지 문자열자르기 
			sum += Integer.parseInt(a);//한개씩 잘린 문자열을 숫자로 바꾼후 더하기
		}
		System.out.println(sum);
	}
}