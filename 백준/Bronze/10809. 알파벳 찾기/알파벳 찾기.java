import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();//문자열 입력
		
		int[] arr = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1; //-1로 초기화
		}
		
		for(int j=0;j<s.length();j++) {
			int a = s.charAt(j) - 'a';//문자열하나하나 읽고
			//'a'를 빼줌으로써 인덱스번호 만들어줌 (a -> 0, b -> 1,..)
			
			if(arr[a]==-1) {
				//배열에 -1이 담겨있으면 아직 안나타난거니까 인덱스를 담아줌
				arr[a] = j; //처음 등장한 인덱스가 담겨야하기때문에 j를 넣음
			}
		}
		
		for(int i=0;i<arr.length;i++) { //츨력
			System.out.print(arr[i]+" ");
		}
	}
}