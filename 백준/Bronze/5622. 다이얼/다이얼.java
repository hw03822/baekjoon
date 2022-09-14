import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] str = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		//ABC는 2번, 3초걸림
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int time = 0;
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<word.length();j++) {
				if(str[i].contains(word.substring(j, j+1))) {
					time += (i+3);
				}
			}
		}
		System.out.println(time);
	}
}
