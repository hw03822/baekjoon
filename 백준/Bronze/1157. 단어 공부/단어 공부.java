import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().toUpperCase();//대문자로 변환해서 저장
		
		int[] count = new int[26]; //알파벳 개수 세기위한 배열
		for(int i=0;i<s.length();i++) { //문자열 수만큼 반복
			int index = s.charAt(i) - 'A'; //하나씩 꺼내서 인덱스로 변환
			count[index]++; //해당 인덱스의 수 증가
		}
        
        int max = 0;
		char answer = '?';
		for(int i=0;i<count.length;i++) { //배열1부터 26까지 확인
			if(max < count[i]) { //i배열의 값이 더 크면 
				max = count[i]; // max에 담아주고 
				answer = (char) (i+'A');//인덱스에다가 알파벳더해야함(알파벳구하기위해)
			}else if(max == count[i]){ // max와 같은값(중복)
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
