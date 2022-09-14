import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		for(int i=0;i<str.length;i++) {
			if(word.contains(str[i])) {
				word = word.replace(str[i], "0");
			}
		}
		System.out.println(word.length());
	}
}
